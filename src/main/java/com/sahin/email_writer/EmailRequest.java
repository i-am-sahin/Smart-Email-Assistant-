package com.sahin.email_writer;

import lombok.Data;

@Data
public class EmailRequest {


    private String emailContent;

    //Tone define the tone like : email should be professional or friendly etc.
    private String tone;
}
