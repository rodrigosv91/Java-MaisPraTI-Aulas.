
package projeto.WebSocket_Spring;


/**
 *
 * @author Rodrigo
 */

public class OutputMessage extends Message {
    
    String time;

    public OutputMessage() {
    }

    public OutputMessage(String time) {
        this.time = time;
    }

    public OutputMessage(String from, String text, String time) {
        super(from, text);
        this.time = time;
    }  

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
       
}
