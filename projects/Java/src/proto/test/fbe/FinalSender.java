// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding test final sender
public class FinalSender extends fbe.Sender
{
    // Imported senders
    public final proto.fbe.FinalSender protoSender;

    // Sender models accessors
    public final StructSimpleFinalModel StructSimpleModel;
    public final StructOptionalFinalModel StructOptionalModel;
    public final StructNestedFinalModel StructNestedModel;
    public final StructBytesFinalModel StructBytesModel;
    public final StructArrayFinalModel StructArrayModel;
    public final StructVectorFinalModel StructVectorModel;
    public final StructListFinalModel StructListModel;
    public final StructSetFinalModel StructSetModel;
    public final StructMapFinalModel StructMapModel;
    public final StructHashFinalModel StructHashModel;
    public final StructHashExFinalModel StructHashExModel;
    public final StructEmptyFinalModel StructEmptyModel;

    public FinalSender()
    {
        super(true);
        protoSender = new proto.fbe.FinalSender(getBuffer());
        StructSimpleModel = new StructSimpleFinalModel(getBuffer());
        StructOptionalModel = new StructOptionalFinalModel(getBuffer());
        StructNestedModel = new StructNestedFinalModel(getBuffer());
        StructBytesModel = new StructBytesFinalModel(getBuffer());
        StructArrayModel = new StructArrayFinalModel(getBuffer());
        StructVectorModel = new StructVectorFinalModel(getBuffer());
        StructListModel = new StructListFinalModel(getBuffer());
        StructSetModel = new StructSetFinalModel(getBuffer());
        StructMapModel = new StructMapFinalModel(getBuffer());
        StructHashModel = new StructHashFinalModel(getBuffer());
        StructHashExModel = new StructHashExFinalModel(getBuffer());
        StructEmptyModel = new StructEmptyFinalModel(getBuffer());
    }
    public FinalSender(Buffer buffer)
    {
        super(buffer, true);
        protoSender = new proto.fbe.FinalSender(getBuffer());
        StructSimpleModel = new StructSimpleFinalModel(getBuffer());
        StructOptionalModel = new StructOptionalFinalModel(getBuffer());
        StructNestedModel = new StructNestedFinalModel(getBuffer());
        StructBytesModel = new StructBytesFinalModel(getBuffer());
        StructArrayModel = new StructArrayFinalModel(getBuffer());
        StructVectorModel = new StructVectorFinalModel(getBuffer());
        StructListModel = new StructListFinalModel(getBuffer());
        StructSetModel = new StructSetFinalModel(getBuffer());
        StructMapModel = new StructMapFinalModel(getBuffer());
        StructHashModel = new StructHashFinalModel(getBuffer());
        StructHashExModel = new StructHashExFinalModel(getBuffer());
        StructEmptyModel = new StructEmptyFinalModel(getBuffer());
    }

    public long send(test.StructSimple value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructSimpleModel.serialize(value);
        assert (serialized > 0) : "test.StructSimple serialization failed!";
        assert StructSimpleModel.verify() : "test.StructSimple validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructOptional value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructOptionalModel.serialize(value);
        assert (serialized > 0) : "test.StructOptional serialization failed!";
        assert StructOptionalModel.verify() : "test.StructOptional validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructNested value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructNestedModel.serialize(value);
        assert (serialized > 0) : "test.StructNested serialization failed!";
        assert StructNestedModel.verify() : "test.StructNested validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructBytes value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructBytesModel.serialize(value);
        assert (serialized > 0) : "test.StructBytes serialization failed!";
        assert StructBytesModel.verify() : "test.StructBytes validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructArray value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructArrayModel.serialize(value);
        assert (serialized > 0) : "test.StructArray serialization failed!";
        assert StructArrayModel.verify() : "test.StructArray validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructVector value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructVectorModel.serialize(value);
        assert (serialized > 0) : "test.StructVector serialization failed!";
        assert StructVectorModel.verify() : "test.StructVector validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructList value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructListModel.serialize(value);
        assert (serialized > 0) : "test.StructList serialization failed!";
        assert StructListModel.verify() : "test.StructList validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructSet value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructSetModel.serialize(value);
        assert (serialized > 0) : "test.StructSet serialization failed!";
        assert StructSetModel.verify() : "test.StructSet validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructMap value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructMapModel.serialize(value);
        assert (serialized > 0) : "test.StructMap serialization failed!";
        assert StructMapModel.verify() : "test.StructMap validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructHash value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructHashModel.serialize(value);
        assert (serialized > 0) : "test.StructHash serialization failed!";
        assert StructHashModel.verify() : "test.StructHash validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructHashEx value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructHashExModel.serialize(value);
        assert (serialized > 0) : "test.StructHashEx serialization failed!";
        assert StructHashExModel.verify() : "test.StructHashEx validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(test.StructEmpty value)
    {
        // Serialize the value into the FBE stream
        long serialized = StructEmptyModel.serialize(value);
        assert (serialized > 0) : "test.StructEmpty serialization failed!";
        assert StructEmptyModel.verify() : "test.StructEmpty validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }

    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("test.fbe.Sender.onSend() not implemented!"); }
}
