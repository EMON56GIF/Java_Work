import java.util.Random;

class Notification {
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public void showNotification() {
        // Made the output more generic so it works cleanly with inheritance
        System.out.println("Notification received: " + message);
    }
}

// Fixed: Overriding the method to show true child behavior 
class ChildNotification extends Notification {
    public ChildNotification(String message) {
        super(message);
    }

    @Override
    public void showNotification() {
        System.out.println("[Child Alert] " + message);
    }
}

public class prithviraj { // Class name starts with Uppercase (Saved as Main.java)
    public static void main(String[] args) {
        String[] apps = {
            "Facebook: You have a new message from Ali.",
            "Instagram: Someone liked your photo.",
            "WhatsApp: A new message arrived.",
            "Telegram: You received a new update.",
            "Twitter: Your post got a new mention."
        };

        Random random = new Random();
        int index = random.nextInt(apps.length);

        // This will now use the child's overridden custom alert display
        ChildNotification obj = new ChildNotification(apps[index]);
        obj.showNotification();
    }
}
