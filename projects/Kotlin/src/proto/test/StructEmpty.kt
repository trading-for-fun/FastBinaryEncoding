// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package test

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class StructEmpty : Comparable<Any?>
{
    constructor()

    @Suppress("UNUSED_PARAMETER")
    constructor(other: StructEmpty)
    {
    }

    open fun clone(): StructEmpty
    {
        // Serialize the struct to the FBE stream
        val writer = test.fbe.StructEmptyModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = test.fbe.StructEmptyModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructEmpty::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructEmpty? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructEmpty::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructEmpty? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructEmpty(")
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = test.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): StructEmpty = test.fbe.Json.engine.fromJson(json, StructEmpty::class.java)
    }
}
