package com.PortFolioGasparJullier.PortFolioGJ.Email.Controller.Service;

import com.PortFolioGasparJullier.PortFolioGJ.Email.Controller.Model.EmailDetails;

public interface EmailService {
    //Interface de servicio para enviar E-mails
    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details); //para enviar correos con archivos adjuntos
}
