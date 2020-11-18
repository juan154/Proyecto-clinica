package Modelo;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class mails {

    public void mail(String correo,String doctor,String paciente,String fecha,String hora) {
        Properties p = new Properties();
        p.setProperty("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.auth", "true");
        Session sesion = Session.getDefaultInstance(p);
        String servidor = "clinicapatitooficial@gmail.com";
        String clave = "Patito123";
        String asunto = "cita programada";
        String text = "estimado cliente "+paciente+" su cita con el doctor "+doctor+" ya quedo programada, recuerde que se pide llegar 15 minutos antes de la hora acordada, para que pueda hacer la fila en recepcion, sin ningun tipo de contratiempos \n"+"Fecha: "+fecha+"\n"+"Hora: "+hora+"\n"+"Gracias por contar con nosotros.";
        MimeMessage mensaje = new MimeMessage(sesion);
        try {
            mensaje.setFrom(new InternetAddress (servidor));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress (correo));
            mensaje.setSubject(asunto);
            mensaje.setText(text);
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(servidor,clave);
            transporte.sendMessage(mensaje,mensaje.getRecipients(Message.RecipientType.TO));
            transporte.close();
            JOptionPane.showMessageDialog(null, "correo enviado", "enviando correo ", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (AddressException ex) {
            Logger.getLogger(mails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(mails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
