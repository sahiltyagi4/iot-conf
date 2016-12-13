/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iot.data.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class StopSessionData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7006035407205329138L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StopSessionData\",\"namespace\":\"com.iot.data.schema\",\"fields\":[{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"duration\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String userId;
  @Deprecated public java.lang.String sessionId;
  @Deprecated public java.lang.String appSessionId;
  @Deprecated public java.lang.String timestamp;
  @Deprecated public java.lang.String action;
  @Deprecated public java.lang.String duration;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StopSessionData() {}

  /**
   * All-args constructor.
   * @param userId The new value for userId
   * @param sessionId The new value for sessionId
   * @param appSessionId The new value for appSessionId
   * @param timestamp The new value for timestamp
   * @param action The new value for action
   * @param duration The new value for duration
   */
  public StopSessionData(java.lang.String userId, java.lang.String sessionId, java.lang.String appSessionId, java.lang.String timestamp, java.lang.String action, java.lang.String duration) {
    this.userId = userId;
    this.sessionId = sessionId;
    this.appSessionId = appSessionId;
    this.timestamp = timestamp;
    this.action = action;
    this.duration = duration;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userId;
    case 1: return sessionId;
    case 2: return appSessionId;
    case 3: return timestamp;
    case 4: return action;
    case 5: return duration;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userId = (java.lang.String)value$; break;
    case 1: sessionId = (java.lang.String)value$; break;
    case 2: appSessionId = (java.lang.String)value$; break;
    case 3: timestamp = (java.lang.String)value$; break;
    case 4: action = (java.lang.String)value$; break;
    case 5: duration = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.String value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'sessionId' field.
   * @return The value of the 'sessionId' field.
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Sets the value of the 'sessionId' field.
   * @param value the value to set.
   */
  public void setSessionId(java.lang.String value) {
    this.sessionId = value;
  }

  /**
   * Gets the value of the 'appSessionId' field.
   * @return The value of the 'appSessionId' field.
   */
  public java.lang.String getAppSessionId() {
    return appSessionId;
  }

  /**
   * Sets the value of the 'appSessionId' field.
   * @param value the value to set.
   */
  public void setAppSessionId(java.lang.String value) {
    this.appSessionId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.String value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'action' field.
   * @return The value of the 'action' field.
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Sets the value of the 'action' field.
   * @param value the value to set.
   */
  public void setAction(java.lang.String value) {
    this.action = value;
  }

  /**
   * Gets the value of the 'duration' field.
   * @return The value of the 'duration' field.
   */
  public java.lang.String getDuration() {
    return duration;
  }

  /**
   * Sets the value of the 'duration' field.
   * @param value the value to set.
   */
  public void setDuration(java.lang.String value) {
    this.duration = value;
  }

  /**
   * Creates a new StopSessionData RecordBuilder.
   * @return A new StopSessionData RecordBuilder
   */
  public static com.iot.data.schema.StopSessionData.Builder newBuilder() {
    return new com.iot.data.schema.StopSessionData.Builder();
  }

  /**
   * Creates a new StopSessionData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StopSessionData RecordBuilder
   */
  public static com.iot.data.schema.StopSessionData.Builder newBuilder(com.iot.data.schema.StopSessionData.Builder other) {
    return new com.iot.data.schema.StopSessionData.Builder(other);
  }

  /**
   * Creates a new StopSessionData RecordBuilder by copying an existing StopSessionData instance.
   * @param other The existing instance to copy.
   * @return A new StopSessionData RecordBuilder
   */
  public static com.iot.data.schema.StopSessionData.Builder newBuilder(com.iot.data.schema.StopSessionData other) {
    return new com.iot.data.schema.StopSessionData.Builder(other);
  }

  /**
   * RecordBuilder for StopSessionData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StopSessionData>
    implements org.apache.avro.data.RecordBuilder<StopSessionData> {

    private java.lang.String userId;
    private java.lang.String sessionId;
    private java.lang.String appSessionId;
    private java.lang.String timestamp;
    private java.lang.String action;
    private java.lang.String duration;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.iot.data.schema.StopSessionData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[1].schema(), other.sessionId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.appSessionId)) {
        this.appSessionId = data().deepCopy(fields()[2].schema(), other.appSessionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.action)) {
        this.action = data().deepCopy(fields()[4].schema(), other.action);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.duration)) {
        this.duration = data().deepCopy(fields()[5].schema(), other.duration);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing StopSessionData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.iot.data.schema.StopSessionData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[1].schema(), other.sessionId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.appSessionId)) {
        this.appSessionId = data().deepCopy(fields()[2].schema(), other.appSessionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.action)) {
        this.action = data().deepCopy(fields()[4].schema(), other.action);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.duration)) {
        this.duration = data().deepCopy(fields()[5].schema(), other.duration);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.String getUserId() {
      return userId;
    }

    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder setUserId(java.lang.String value) {
      validate(fields()[0], value);
      this.userId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sessionId' field.
      * @return The value.
      */
    public java.lang.String getSessionId() {
      return sessionId;
    }

    /**
      * Sets the value of the 'sessionId' field.
      * @param value The value of 'sessionId'.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder setSessionId(java.lang.String value) {
      validate(fields()[1], value);
      this.sessionId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sessionId' field has been set.
      * @return True if the 'sessionId' field has been set, false otherwise.
      */
    public boolean hasSessionId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sessionId' field.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder clearSessionId() {
      sessionId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'appSessionId' field.
      * @return The value.
      */
    public java.lang.String getAppSessionId() {
      return appSessionId;
    }

    /**
      * Sets the value of the 'appSessionId' field.
      * @param value The value of 'appSessionId'.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder setAppSessionId(java.lang.String value) {
      validate(fields()[2], value);
      this.appSessionId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'appSessionId' field has been set.
      * @return True if the 'appSessionId' field has been set, false otherwise.
      */
    public boolean hasAppSessionId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'appSessionId' field.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder clearAppSessionId() {
      appSessionId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.String getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder setTimestamp(java.lang.String value) {
      validate(fields()[3], value);
      this.timestamp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'action' field.
      * @return The value.
      */
    public java.lang.String getAction() {
      return action;
    }

    /**
      * Sets the value of the 'action' field.
      * @param value The value of 'action'.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder setAction(java.lang.String value) {
      validate(fields()[4], value);
      this.action = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'action' field has been set.
      * @return True if the 'action' field has been set, false otherwise.
      */
    public boolean hasAction() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'action' field.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder clearAction() {
      action = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'duration' field.
      * @return The value.
      */
    public java.lang.String getDuration() {
      return duration;
    }

    /**
      * Sets the value of the 'duration' field.
      * @param value The value of 'duration'.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder setDuration(java.lang.String value) {
      validate(fields()[5], value);
      this.duration = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'duration' field has been set.
      * @return True if the 'duration' field has been set, false otherwise.
      */
    public boolean hasDuration() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'duration' field.
      * @return This builder.
      */
    public com.iot.data.schema.StopSessionData.Builder clearDuration() {
      duration = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public StopSessionData build() {
      try {
        StopSessionData record = new StopSessionData();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.String) defaultValue(fields()[0]);
        record.sessionId = fieldSetFlags()[1] ? this.sessionId : (java.lang.String) defaultValue(fields()[1]);
        record.appSessionId = fieldSetFlags()[2] ? this.appSessionId : (java.lang.String) defaultValue(fields()[2]);
        record.timestamp = fieldSetFlags()[3] ? this.timestamp : (java.lang.String) defaultValue(fields()[3]);
        record.action = fieldSetFlags()[4] ? this.action : (java.lang.String) defaultValue(fields()[4]);
        record.duration = fieldSetFlags()[5] ? this.duration : (java.lang.String) defaultValue(fields()[5]);
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