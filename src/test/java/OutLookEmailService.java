public class OutLookEmailService implements IEmailService{

    @Override
    public void sendEmail(String subject, String content, String from, String to) {
        System.out.println("we send the mail by OutLook");
    }
}
