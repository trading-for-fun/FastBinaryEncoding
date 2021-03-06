// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package enums.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import enums.*

import com.google.gson.*

class EnumUInt64Json : JsonSerializer<EnumUInt64>, JsonDeserializer<EnumUInt64>
{
    override fun serialize(src: EnumUInt64, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        return JsonPrimitive(src.raw.toLong())
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): EnumUInt64
    {
        return EnumUInt64(json.asJsonPrimitive.asLong.toULong())
    }
}
