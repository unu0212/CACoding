package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    public ArrayList<String> execute(){
        ArrayList<String> n = userDataAccessObject.delete();
        ClearOutputData clearOutputData = new ClearOutputData(n);
        clearPresenter.prepareSuccessView(clearOutputData);
        return n;

    }
}
