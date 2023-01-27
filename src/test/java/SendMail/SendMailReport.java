package SendMail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendMailReport {
    public static void main(String[] args) throws EmailException {
        System.out.println("Test started");
        Email email = new SimpleEmail();
        System.out.println("create object for simpleemail class");
        email.setHostName("smtp.gmail.com");
        System.out.println("setted host name");
        email.setSmtpPort(587);
        System.out.println("setted port");
        email.setAuthenticator(new DefaultAuthenticator("shalini.iruvuru@zemosolabs.com", "elzantuhbxztxijy"));
        System.out.println("given user name and password");
        email.setSSLOnConnect(true);
        email.setSSLCheckServerIdentity(true);
        email.setStartTLSRequired(true);
        email.setFrom("shalini.iruvuru@zemosolabs.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("shalini.iruvuru@zemosolabs.com");
        email.send();
        System.out.println("mail sent");

    }
}

