package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.List;


public class ClearPresenter implements ClearOutputBoundary{
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;
    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel){
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }
    @Override
    public void prepareClearView(ClearOutputData user) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsers(user.getUsers());
        clearViewModel.firePropertyChanged();
    }
    //    public List<String> prepareClearView(ClearOutputData users){
//        clearViewModel.firePropertyChanged();
//        viewManagerModel.setActiveView(clearViewModel.getViewName());
//        viewManagerModel.firePropertyChanged();
//        return users.getUsers();
//    }

}
