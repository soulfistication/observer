package javaapplication2;

public class SecurityGateManager implements SecurityGateListener {
    
    SecurityGate gate;
    
    SecurityGateManager(SecurityGate gate) {
        this.gate = gate;
        gate.addListener(this);
    }

    public void gateStateChanged(SecurityGate gate) {
        System.out.println("Security Gate Changed!");
    }
    
}
