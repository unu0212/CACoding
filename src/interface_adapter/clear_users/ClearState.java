package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;
import java.util.List;



public class ClearState {
    private List<String> users;
    public ClearState(ClearState copy) {
        users = copy.users;
    }
    public ClearState(){

    }
    public String getUsers(){
        String user = String.join("\n", users);
        return user;
    }
    public void setUsers(List<String> users){
        this.users = users;
    }
}
