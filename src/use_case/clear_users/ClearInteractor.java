package use_case.clear_users;

// TODO Complete me


import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearUserDataAccessInterface;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary userPresenter){
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
        this.userPresenter = userPresenter;
    }
    @Override
    public void execute(){
        ClearOutputData clearOutputData = new ClearOutputData(clearUserDataAccessInterface.clear());
        userPresenter.prepareClearView(clearOutputData);
    }
}
