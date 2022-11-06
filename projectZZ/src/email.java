import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javax.activation.*;


public class email  {
	protected static String pass = "GeneralKenobiYouAreABoldOne#66";
	protected static String address;
	public static String sender = "stem4change2020@gmail.com";
	public static String type; 
	public static String msg;
	public static String subj; 
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Abhi\\Documents\\names.txt");
		Scanner in = new Scanner(System.in);
		System.out.println("Advance read? y/n");
		String dec = in.nextLine();
		if(dec.equals("y")) {
			parseadv(file);
		} else {
			parse(file);
		}
		
	}
	
	public static void parseadv(File file) throws FileNotFoundException {
		Scanner input = new Scanner(file); 
		while(input.hasNext()) {
			address = input.next().toLowerCase();
			type = input.next();
			Person p1 = new Person(address, type);
			Person.stor.add(p1);
			}
		Set<Person> s = new HashSet<Person>();
		s.addAll(Person.stor);
		Person.stor.clear();
		Person.stor.addAll(s);
		System.out.println(Person.stor);
		System.out.println(Person.stor.size()+" Messages to send");
		System.out.println();
		for(int i = 0; i<Person.stor.size(); i++) {
			if(Person.stor.get(i).typ.equals("IntroductiontoJavaProgramming")) {
				msg = "Hello, \n\nYou are receiving this e-mail as you have signed up for our Introduction to Java course. The meetings will take place through Zoom and the invite is located below. We look forward to teaching you! Please e-mail us if you have any questions.\n\nStay Safe,\nSTEM4Change\n\nSTEM4Change is inviting you to a scheduled Zoom meeting.\n\nTopic: Intro to Java\nTime: Sep 14, 2020 04:00 PM Pacific Time (US and Canada)\n        Every week on Mon, Fri, until Oct 2, 2020, 6 occurrence(s)\n        Sep 14, 2020 04:00 PM\n        Sep 18, 2020 04:00 PM\n        Sep 21, 2020 04:00 PM\n        Sep 25, 2020 04:00 PM\n        Sep 28, 2020 04:00 PM\n        Oct 2, 2020 04:00 PM\nPlease download and import the following iCalendar (.ics) files to your calendar system.\nWeekly: https://us04web.zoom.us/meeting/upAtcuqqrjgoEt2dLGLSdb7Sj_P1kFrQcDsM/ics?icsToken=98tyKu6srj4pGNSWshGOR7YIAo_4b-rziHZBj7cPmDPCLxNXYFTFPN1yY7lZAunT\n\nJoin Zoom Meeting\nhttps://us04web.zoom.us/j/74053203289?pwd=REs0Z3RVQTNGaW5aaWpRMDJFMzVMZz09\n\nMeeting ID: 740 5320 3289\nPasscode: 3XUL6g\n\n\n\n\n";
				subj = "Introduction to Java Reminder";
			}
			if(Person.stor.get(i).typ.equals("FundamentalsofJavaProgramming")) {
				msg = "Hello, \n\nYou are receiving this e-mail as you have signed up for our Fundamentals of Java course. The meetings will take place through Zoom and the invite is located below. We look forward to teaching you! Please e-mail us if you have any questions.\n\nStay Safe,\nSTEM4Change\n\nSTEM4Change is inviting you to a scheduled Zoom meeting.\n\nTopic: Fundamentals of Java\nTime: Sep 15, 2020 04:00 PM Pacific Time (US and Canada)\n        Every week on Tue, Thu, until Oct 1, 2020, 6 occurrence(s)\n        Sep 15, 2020 04:00 PM\n        Sep 17, 2020 04:00 PM\n        Sep 22, 2020 04:00 PM\n        Sep 24, 2020 04:00 PM\n        Sep 29, 2020 04:00 PM\n        Oct 1, 2020 04:00 PM\nPlease download and import the following iCalendar (.ics) files to your calendar system.\nWeekly: https://us04web.zoom.us/meeting/upUrde6hpzgrHdaYmk_9BNfRwX2T6OXPTIm0/ics?icsToken=98tyKu6pqDktE92WsR6FR7YcBIjoKPPxmHZcgqdcpRLuPHlxTAXEIdoQBuRQKOjk\n\nJoin Zoom Meeting\nhttps://us04web.zoom.us/j/71627993172?pwd=ZTMrcXR6aFpaN3VDK1g5QVVIZTFjQT09\n\nMeeting ID: 716 2799 3172\nPasscode: 08AFnQ\n\n\n";
				subj = "Fundamentals of Java Reminder";
			}
			if(Person.stor.get(i).typ.equals("Biology")) {
				msg = "Hello, \n\nYou are receiving this e-mail as you have signed up for our Introduction to Biology course. The meetings will take place through Zoom and the invite is located below. We look forward to teaching you! Please e-mail us if you have any questions.\n\nStay Safe,\nSTEM4Change\n\nSTEM4Change is inviting you to a scheduled Zoom meeting.\n\nTopic: Biology\nTime: Sep 16, 2020 04:00 PM Pacific Time (US and Canada)\n        Every week on Wed, Fri, until Oct 2, 2020, 6 occurrence(s)\n        Sep 16, 2020 04:00 PM\n        Sep 18, 2020 04:00 PM\n        Sep 23, 2020 04:00 PM\n        Sep 25, 2020 04:00 PM\n        Sep 30, 2020 04:00 PM\n        Oct 2, 2020 04:00 PM\nPlease download and import the following iCalendar (.ics) files to your calendar system.\nWeekly: https://us04web.zoom.us/meeting/upMtdu-vqj0jGtPrZ0dV5Cw5o3_1arjfWa3g/ics?icsToken=98tyKu6vrjosHdCTuRmAR7YEAoj4M-3wiCFEjbdtjiW1BxYGQRSjObF9Y7NtGt7n\n\nJoin Zoom Meeting\nhttps://us04web.zoom.us/j/77016746907?pwd=ZUtDN29iWU1DMjg3MktzSk5lbTI3dz09\n\nMeeting ID: 770 1674 6907\nPasscode: y1TDGD\n\n";
				subj = "Introduction to Biology Reminder";
			}
			if(Person.stor.get(i).typ.equals("Algebra2")) {
				msg = " ";
				subj = " ";
			}
			
			send(sender, pass, Person.stor.get(i).address, subj, msg);
		}
		
	}
	public static void parse(File file) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			list.add(input.next());
		}
		for(int i = 0; i<list.size(); i++) {
			list.set(i, list.get(i).toLowerCase());
		}
		removeDuplicates(list);
		System.out.println(list);
		for(int i = 0; i<list.size(); i++) {
			subj = "Class Meeting link";
			msg = "Hello \n\nHere is the link for the class meetings that start this week. Visit www.stem4change.us for the schedule. We look forward to seeing you soon!\n\nStay Safe, \nSTEM4Change\n\nJoin Zoom Meeting\nhttps://us04web.zoom.us/j/73373489802?pwd=L2tza3lIWDFWZGFJNTdvWmFLTVZ0UT09\n\nMeeting ID: 733 7348 9802\nPasscode: 123\n";
			send(sender, pass, list.get(i), subj, msg);
		}
	}
	public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		ArrayList<String> list2 = new ArrayList<>(list);
		list.clear();
		for(String ele: list2) {
			if(!list.contains(ele)) {
				list.add(ele);
			}
		}
		return list;
	}
	

	
	public static void send(String from,String password,String to,String sub,String msg){  
        //Get properties object    
        Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        //get Session   
        Session session = Session.getDefaultInstance(props,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication(from,password);  
         }    
        });    
        //compose message    
        try {    
         MimeMessage message = new MimeMessage(session);    
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
         message.setSubject(sub);    
         message.setText(msg);    
         //send message  
         Transport.send(message);    
         System.out.println("message sent successfully");    
        } catch (MessagingException e) {throw new RuntimeException(e);}    
           
  }  
}
