package net.shortninja.staffplusplus.trace;

import java.util.List;
import java.util.UUID;

public interface ITrace {
    List<TraceWriter> getWriters();

    UUID getTracerUuid();

    String getTracedName();

    UUID getTracedUuid();
}
