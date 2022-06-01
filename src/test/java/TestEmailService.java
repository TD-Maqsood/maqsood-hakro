import java.lang.reflect.Proxy;

public class TestEmailService {
    public static void main (){
        

        IEmailService emailService = new OutLookEmailService();
        emailService.sendEmail("subject","this is a test mail","huyanlin@outlook.com","mashide@outlook.com");
    }
}

//