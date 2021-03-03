package net.shortninja.staffplusplus.trace;

public interface TraceWriter {

    void writeToTrace(String message);

    void stopTrace();

    String getResource();

    TraceOutputChannel getType();
}
