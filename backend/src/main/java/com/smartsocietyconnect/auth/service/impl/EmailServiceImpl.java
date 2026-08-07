package com.smartsocietyconnect.auth.service.impl;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartsocietyconnect.auth.service.EmailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import jakarta.mail.internet.MimeMessage;

/**
 * Service implementation for email operations.
 *
 * <p>Handles:
 * <ul>
 *     <li>OTP email delivery</li>
 *     <li>Password reset notifications</li>
 *     <li>General authentication emails</li>
 * </ul>
 *
 * <p>Uses Spring Boot's {@link JavaMailSender}
 * for SMTP-based email delivery.
 *
 * @author Smart Society Connect Team
 * @version 1.0
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)

public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    private static final String EMAIL_SUBJECT = 
            "Smart Society Connect - OTP Verification";

    /**
     * Sends OTP email to user.
     *
     * @param toEmail recipient email address
     * @param otpCode generated OTP
     */
    @Override
    @Async
    public void sendOtp(String toEmail, String otpCode) {

        log.info("Sending OTP email to: {}", toEmail);

        try {

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
            helper.setTo(toEmail);
            helper.setSubject(EMAIL_SUBJECT);
            helper.setText(buildOtpEmailBody(otpCode), true);

            // Set from address (configured in application.yml)
            // message.setFrom("noreply@smartsocietyconnect.com");

            mailSender.send(message);

            log.info("OTP email sent successfully to: {}", toEmail);

        } catch (Exception exception) {

            log.error("Failed to send OTP email to: {}", toEmail, exception);

            throw new RuntimeException("Unable to send OTP email", exception);
        }
    }

    /**
     * Builds the OTP email body.
     *
     * @param otpCode generated OTP
     * @return formatted email body
     */
    private String buildOtpEmailBody(String otpCode) {
        return """
                <!doctype html>
                <html lang="en">
                  <body style="margin:0;padding:0;background:#fff7f5;font-family:Arial,Helvetica,sans-serif;color:#1f2937;">
                    <table role="presentation" width="100%%" cellspacing="0" cellpadding="0" border="0" style="background:#fff7f5;padding:32px 16px;">
                      <tr><td align="center">
                        <table role="presentation" width="100%%" cellspacing="0" cellpadding="0" border="0" style="max-width:600px;background:#ffffff;border:1px solid #ffe1dc;border-radius:20px;overflow:hidden;box-shadow:0 12px 36px rgba(127,29,29,.10);">
                          <tr><td style="background:linear-gradient(135deg,#be123c,#dc2626,#f97316);padding:28px 36px;color:#ffffff;">
                            <div style="font-size:13px;font-weight:700;letter-spacing:1.8px;text-transform:uppercase;opacity:.9;">Smart Society Connect</div>
                            <div style="margin-top:10px;font-size:28px;font-weight:700;line-height:1.25;">Confirm your email address</div>
                          </td></tr>
                          <tr><td style="padding:34px 36px 24px;">
                            <p style="margin:0 0 16px;font-size:16px;line-height:1.6;">Hello,</p>
                            <p style="margin:0 0 22px;font-size:16px;line-height:1.6;">Thank you for creating your Smart Society Connect account. Use the verification code below to confirm your email address and complete your registration.</p>
                            <div style="margin:0 auto 24px;padding:18px 20px;border:1px solid #fecaca;border-radius:14px;background:#fff1f2;text-align:center;">
                              <div style="font-size:12px;font-weight:700;letter-spacing:1.2px;text-transform:uppercase;color:#9f1239;">Your verification code</div>
                              <div style="margin-top:8px;font-size:32px;font-weight:700;letter-spacing:8px;color:#9f1239;">%s</div>
                            </div>
                            <p style="margin:0 0 12px;font-size:15px;line-height:1.6;">This code expires in <strong>5 minutes</strong> and can be used only once.</p>
                            <p style="margin:0 0 24px;font-size:15px;line-height:1.6;">For your security, never share this code with anyone. Smart Society Connect will never ask you for it by phone, text message, or email.</p>
                            <p style="margin:0;font-size:15px;line-height:1.6;">If you did not request this account, you can safely ignore this email.</p>
                          </td></tr>
                          <tr><td style="padding:20px 36px;background:#fff7f5;border-top:1px solid #ffe4e6;color:#6b7280;font-size:12px;line-height:1.6;">
                            This is an automated security message from Smart Society Connect. Please do not reply to this email.
                          </td></tr>
                        </table>
                      </td></tr>
                    </table>
                  </body>
                </html>
                """.formatted(otpCode);
    }

}
