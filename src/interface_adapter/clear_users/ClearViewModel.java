package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("clear");
    }

    public void setState(ClearState state){this.state = state;}
    public ClearState getState(){return state;}
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

}
