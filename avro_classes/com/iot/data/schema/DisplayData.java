/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iot.data.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DisplayData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4627749342959792275L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DisplayData\",\"namespace\":\"com.iot.data.schema\",\"fields\":[{\"name\":\"displayHeight\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"displayWidth\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"displayDensity\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Long displayHeight;
  @Deprecated public java.lang.Long displayWidth;
  @Deprecated public java.lang.Long displayDensity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DisplayData() {}

  /**
   * All-args constructor.
   * @param displayHeight The new value for displayHeight
   * @param displayWidth The new value for displayWidth
   * @param displayDensity The new value for displayDensity
   */
  public DisplayData(java.lang.Long displayHeight, java.lang.Long displayWidth, java.lang.Long displayDensity) {
    this.displayHeight = displayHeight;
    this.displayWidth = displayWidth;
    this.displayDensity = displayDensity;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return displayHeight;
    case 1: return displayWidth;
    case 2: return displayDensity;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: displayHeight = (java.lang.Long)value$; break;
    case 1: displayWidth = (java.lang.Long)value$; break;
    case 2: displayDensity = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'displayHeight' field.
   * @return The value of the 'displayHeight' field.
   */
  public java.lang.Long getDisplayHeight() {
    return displayHeight;
  }

  /**
   * Sets the value of the 'displayHeight' field.
   * @param value the value to set.
   */
  public void setDisplayHeight(java.lang.Long value) {
    this.displayHeight = value;
  }

  /**
   * Gets the value of the 'displayWidth' field.
   * @return The value of the 'displayWidth' field.
   */
  public java.lang.Long getDisplayWidth() {
    return displayWidth;
  }

  /**
   * Sets the value of the 'displayWidth' field.
   * @param value the value to set.
   */
  public void setDisplayWidth(java.lang.Long value) {
    this.displayWidth = value;
  }

  /**
   * Gets the value of the 'displayDensity' field.
   * @return The value of the 'displayDensity' field.
   */
  public java.lang.Long getDisplayDensity() {
    return displayDensity;
  }

  /**
   * Sets the value of the 'displayDensity' field.
   * @param value the value to set.
   */
  public void setDisplayDensity(java.lang.Long value) {
    this.displayDensity = value;
  }

  /**
   * Creates a new DisplayData RecordBuilder.
   * @return A new DisplayData RecordBuilder
   */
  public static com.iot.data.schema.DisplayData.Builder newBuilder() {
    return new com.iot.data.schema.DisplayData.Builder();
  }

  /**
   * Creates a new DisplayData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DisplayData RecordBuilder
   */
  public static com.iot.data.schema.DisplayData.Builder newBuilder(com.iot.data.schema.DisplayData.Builder other) {
    return new com.iot.data.schema.DisplayData.Builder(other);
  }

  /**
   * Creates a new DisplayData RecordBuilder by copying an existing DisplayData instance.
   * @param other The existing instance to copy.
   * @return A new DisplayData RecordBuilder
   */
  public static com.iot.data.schema.DisplayData.Builder newBuilder(com.iot.data.schema.DisplayData other) {
    return new com.iot.data.schema.DisplayData.Builder(other);
  }

  /**
   * RecordBuilder for DisplayData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DisplayData>
    implements org.apache.avro.data.RecordBuilder<DisplayData> {

    private java.lang.Long displayHeight;
    private java.lang.Long displayWidth;
    private java.lang.Long displayDensity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.iot.data.schema.DisplayData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.displayHeight)) {
        this.displayHeight = data().deepCopy(fields()[0].schema(), other.displayHeight);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.displayWidth)) {
        this.displayWidth = data().deepCopy(fields()[1].schema(), other.displayWidth);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.displayDensity)) {
        this.displayDensity = data().deepCopy(fields()[2].schema(), other.displayDensity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DisplayData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.iot.data.schema.DisplayData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.displayHeight)) {
        this.displayHeight = data().deepCopy(fields()[0].schema(), other.displayHeight);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.displayWidth)) {
        this.displayWidth = data().deepCopy(fields()[1].schema(), other.displayWidth);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.displayDensity)) {
        this.displayDensity = data().deepCopy(fields()[2].schema(), other.displayDensity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'displayHeight' field.
      * @return The value.
      */
    public java.lang.Long getDisplayHeight() {
      return displayHeight;
    }

    /**
      * Sets the value of the 'displayHeight' field.
      * @param value The value of 'displayHeight'.
      * @return This builder.
      */
    public com.iot.data.schema.DisplayData.Builder setDisplayHeight(java.lang.Long value) {
      validate(fields()[0], value);
      this.displayHeight = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'displayHeight' field has been set.
      * @return True if the 'displayHeight' field has been set, false otherwise.
      */
    public boolean hasDisplayHeight() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'displayHeight' field.
      * @return This builder.
      */
    public com.iot.data.schema.DisplayData.Builder clearDisplayHeight() {
      displayHeight = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'displayWidth' field.
      * @return The value.
      */
    public java.lang.Long getDisplayWidth() {
      return displayWidth;
    }

    /**
      * Sets the value of the 'displayWidth' field.
      * @param value The value of 'displayWidth'.
      * @return This builder.
      */
    public com.iot.data.schema.DisplayData.Builder setDisplayWidth(java.lang.Long value) {
      validate(fields()[1], value);
      this.displayWidth = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'displayWidth' field has been set.
      * @return True if the 'displayWidth' field has been set, false otherwise.
      */
    public boolean hasDisplayWidth() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'displayWidth' field.
      * @return This builder.
      */
    public com.iot.data.schema.DisplayData.Builder clearDisplayWidth() {
      displayWidth = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'displayDensity' field.
      * @return The value.
      */
    public java.lang.Long getDisplayDensity() {
      return displayDensity;
    }

    /**
      * Sets the value of the 'displayDensity' field.
      * @param value The value of 'displayDensity'.
      * @return This builder.
      */
    public com.iot.data.schema.DisplayData.Builder setDisplayDensity(java.lang.Long value) {
      validate(fields()[2], value);
      this.displayDensity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'displayDensity' field has been set.
      * @return True if the 'displayDensity' field has been set, false otherwise.
      */
    public boolean hasDisplayDensity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'displayDensity' field.
      * @return This builder.
      */
    public com.iot.data.schema.DisplayData.Builder clearDisplayDensity() {
      displayDensity = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public DisplayData build() {
      try {
        DisplayData record = new DisplayData();
        record.displayHeight = fieldSetFlags()[0] ? this.displayHeight : (java.lang.Long) defaultValue(fields()[0]);
        record.displayWidth = fieldSetFlags()[1] ? this.displayWidth : (java.lang.Long) defaultValue(fields()[1]);
        record.displayDensity = fieldSetFlags()[2] ? this.displayDensity : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}