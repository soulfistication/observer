package javaapplication2;

import java.util.HashSet;

public class SecurityGate {
    private HashSet<SecurityGateListener> listeners;
    private boolean open;
    
    SecurityGate() {
        listeners = new HashSet<SecurityGateListener>();
        open = false;
    }
    
    public void addListener(SecurityGateListener listener) {
        listeners.add(listener);
    }
    
    public void removeListener(SecurityGateListener listener) {
        listeners.remove(listener);
    }
    
    private void fireStateChanged() {
        for (SecurityGateListener listener : listeners) {
            listener.gateStateChanged(this);
        }
    }
    
    public boolean getOpen() {
        return this.open;
    }
    
    public void setOpen(boolean open) {
        if (this.open != open) {
            this.open = open;
            fireStateChanged();
        }
    }
}
