package com.kirtar.lab_7.commands.concrete;

import com.kirtar.lab_7.commands.Command;
import com.kirtar.lab_7.commands.Receiver;
import com.kirtar.lab_7.messages.ServerResponse;
/**
 * display unique values of the view field of all elements in the collection
 */

public class PrintUniqueViewCommand implements Command{

    private Receiver receiver;
    private String user;
    public PrintUniqueViewCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public ServerResponse execute()
    {
        return receiver.printUniqueView();
    }
    public void setArg(Object element){}
    public void setUser(String user){
        this.user = user;
    }
        public String getUser()
    {
        return user;
    }
}
