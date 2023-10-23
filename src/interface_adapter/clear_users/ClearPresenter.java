package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ClearViewModel clearViewModel,
                          ViewManagerModel viewManagerModel){
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }
    public ArrayList<String> prepareSuccessView(ClearOutputData response){
        ArrayList<String> users = response.getUsernames();
        ClearState clearState = clearViewModel.getState();
        clearState.delete_user();
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
        return users;
    }

}
