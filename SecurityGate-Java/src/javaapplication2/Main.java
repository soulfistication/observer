package javaapplication2;

class Main {

    public static void main(String[] args) {
        
        SecurityGate gate = new SecurityGate();
        SecurityGateManager manager = new SecurityGateManager(gate);
        
        gate.setOpen(true);
        gate.setOpen(false);
        gate.setOpen(true);
        gate.setOpen(false);
        gate.setOpen(false);
        
    }

}
