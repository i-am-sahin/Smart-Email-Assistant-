package com.sahin.email_writer;

import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {
    public String generateEmailReply(EmailRequest emailRequest) {
        //Build Prompt
        String prompt = buildPrompt(emailRequest);
        //Prepare RAW JSON Body
        String requestBody = String.format(
                """
                        {
                            "contents": [
                              {
                                "parts": [
                                  {
                                    "text": "%s"
                                  }
                                ]
                              }
                            ]
                          }
                """,prompt);
        //Send Request
        //Extract Response
    }

    private String buildPrompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a Professional email reply for the following email : ");
        if (emailRequest.getTone() != null && !(emailRequest.getTone().isEmpty())){
            prompt.append("use a ").append(emailRequest.getTone()).append(" tone");
        }
        prompt.append("Original Email : \n").append(emailRequest.getEmailContent());

        return prompt.toString();
    }
}
