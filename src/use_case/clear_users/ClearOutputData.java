package use_case.clear_users;

// TODO Complete me


import java.util.List;

public class ClearOutputData {
   private final List<String> deleted_users;

   public ClearOutputData(List<String> users){
       this.deleted_users = users;
   }
   public List<String> getUsers(){return deleted_users;}
}
