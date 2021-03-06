/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iot.data.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AppBuildData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4139395172517818333L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AppBuildData\",\"namespace\":\"com.iot.data.schema\",\"fields\":[{\"name\":\"packageName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"versionCode\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"versionName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String packageName;
  @Deprecated public java.lang.Long versionCode;
  @Deprecated public java.lang.String versionName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AppBuildData() {}

  /**
   * All-args constructor.
   * @param packageName The new value for packageName
   * @param versionCode The new value for versionCode
   * @param versionName The new value for versionName
   */
  public AppBuildData(java.lang.String packageName, java.lang.Long versionCode, java.lang.String versionName) {
    this.packageName = packageName;
    this.versionCode = versionCode;
    this.versionName = versionName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return packageName;
    case 1: return versionCode;
    case 2: return versionName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: packageName = (java.lang.String)value$; break;
    case 1: versionCode = (java.lang.Long)value$; break;
    case 2: versionName = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'packageName' field.
   * @return The value of the 'packageName' field.
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Sets the value of the 'packageName' field.
   * @param value the value to set.
   */
  public void setPackageName(java.lang.String value) {
    this.packageName = value;
  }

  /**
   * Gets the value of the 'versionCode' field.
   * @return The value of the 'versionCode' field.
   */
  public java.lang.Long getVersionCode() {
    return versionCode;
  }

  /**
   * Sets the value of the 'versionCode' field.
   * @param value the value to set.
   */
  public void setVersionCode(java.lang.Long value) {
    this.versionCode = value;
  }

  /**
   * Gets the value of the 'versionName' field.
   * @return The value of the 'versionName' field.
   */
  public java.lang.String getVersionName() {
    return versionName;
  }

  /**
   * Sets the value of the 'versionName' field.
   * @param value the value to set.
   */
  public void setVersionName(java.lang.String value) {
    this.versionName = value;
  }

  /**
   * Creates a new AppBuildData RecordBuilder.
   * @return A new AppBuildData RecordBuilder
   */
  public static com.iot.data.schema.AppBuildData.Builder newBuilder() {
    return new com.iot.data.schema.AppBuildData.Builder();
  }

  /**
   * Creates a new AppBuildData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AppBuildData RecordBuilder
   */
  public static com.iot.data.schema.AppBuildData.Builder newBuilder(com.iot.data.schema.AppBuildData.Builder other) {
    return new com.iot.data.schema.AppBuildData.Builder(other);
  }

  /**
   * Creates a new AppBuildData RecordBuilder by copying an existing AppBuildData instance.
   * @param other The existing instance to copy.
   * @return A new AppBuildData RecordBuilder
   */
  public static com.iot.data.schema.AppBuildData.Builder newBuilder(com.iot.data.schema.AppBuildData other) {
    return new com.iot.data.schema.AppBuildData.Builder(other);
  }

  /**
   * RecordBuilder for AppBuildData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AppBuildData>
    implements org.apache.avro.data.RecordBuilder<AppBuildData> {

    private java.lang.String packageName;
    private java.lang.Long versionCode;
    private java.lang.String versionName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.iot.data.schema.AppBuildData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.packageName)) {
        this.packageName = data().deepCopy(fields()[0].schema(), other.packageName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.versionCode)) {
        this.versionCode = data().deepCopy(fields()[1].schema(), other.versionCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.versionName)) {
        this.versionName = data().deepCopy(fields()[2].schema(), other.versionName);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AppBuildData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.iot.data.schema.AppBuildData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.packageName)) {
        this.packageName = data().deepCopy(fields()[0].schema(), other.packageName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.versionCode)) {
        this.versionCode = data().deepCopy(fields()[1].schema(), other.versionCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.versionName)) {
        this.versionName = data().deepCopy(fields()[2].schema(), other.versionName);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'packageName' field.
      * @return The value.
      */
    public java.lang.String getPackageName() {
      return packageName;
    }

    /**
      * Sets the value of the 'packageName' field.
      * @param value The value of 'packageName'.
      * @return This builder.
      */
    public com.iot.data.schema.AppBuildData.Builder setPackageName(java.lang.String value) {
      validate(fields()[0], value);
      this.packageName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'packageName' field has been set.
      * @return True if the 'packageName' field has been set, false otherwise.
      */
    public boolean hasPackageName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'packageName' field.
      * @return This builder.
      */
    public com.iot.data.schema.AppBuildData.Builder clearPackageName() {
      packageName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'versionCode' field.
      * @return The value.
      */
    public java.lang.Long getVersionCode() {
      return versionCode;
    }

    /**
      * Sets the value of the 'versionCode' field.
      * @param value The value of 'versionCode'.
      * @return This builder.
      */
    public com.iot.data.schema.AppBuildData.Builder setVersionCode(java.lang.Long value) {
      validate(fields()[1], value);
      this.versionCode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'versionCode' field has been set.
      * @return True if the 'versionCode' field has been set, false otherwise.
      */
    public boolean hasVersionCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'versionCode' field.
      * @return This builder.
      */
    public com.iot.data.schema.AppBuildData.Builder clearVersionCode() {
      versionCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'versionName' field.
      * @return The value.
      */
    public java.lang.String getVersionName() {
      return versionName;
    }

    /**
      * Sets the value of the 'versionName' field.
      * @param value The value of 'versionName'.
      * @return This builder.
      */
    public com.iot.data.schema.AppBuildData.Builder setVersionName(java.lang.String value) {
      validate(fields()[2], value);
      this.versionName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'versionName' field has been set.
      * @return True if the 'versionName' field has been set, false otherwise.
      */
    public boolean hasVersionName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'versionName' field.
      * @return This builder.
      */
    public com.iot.data.schema.AppBuildData.Builder clearVersionName() {
      versionName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public AppBuildData build() {
      try {
        AppBuildData record = new AppBuildData();
        record.packageName = fieldSetFlags()[0] ? this.packageName : (java.lang.String) defaultValue(fields()[0]);
        record.versionCode = fieldSetFlags()[1] ? this.versionCode : (java.lang.Long) defaultValue(fields()[1]);
        record.versionName = fieldSetFlags()[2] ? this.versionName : (java.lang.String) defaultValue(fields()[2]);
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
