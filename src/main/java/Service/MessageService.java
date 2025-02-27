package Service;

import DAO.MessageDAO;
import Model.Message;

import java.util.List;

/**
 * The purpose of a Service class is to contain "business logic" that sits between the web layer (controller) and
 * persistence layer (DAO). That means that the Service class performs tasks that aren't done through the web or
 * SQL: programming tasks like checking that the input is valid, conducting additional security checks, or saving the
 * actions undertaken by the API to a logging file.
 *
 * It's perfectly normal to have Service methods that only contain a single line that calls a DAO method. An
 * application that follows best practices will often have unnecessary code, but this makes the code more
 * readable and maintainable in the long run!
 */
public class MessageService {
    public MessageDAO messageDAO;

    /**
     * No-args constructor for bookService which creates a BookDAO.
     * There is no need to change this constructor.
     */
    public MessageService(){
        messageDAO = new MessageDAO();
    }
    
    public MessageService(MessageDAO messageDAO){
        this.messageDAO = messageDAO;
    }
    
    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }
    
    public Message addMessage(Message message) {
        return messageDAO.insertMessage(message);
    }

    public Message getMessageById(int id) {
        return messageDAO.getMessageById(id);
    }

    public Message deleteMessageById(int id) {
        return messageDAO.deleteMessageById(id);
    }

    public Message updateMessageById(int id, Message text) {
        return messageDAO.UpdateMessage(id, text);
    }

    public List<Message> getAllMessagesFromUser(int id) {
        return messageDAO.getAllMessagesFromUser(id);
    }
}
