/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iot.data.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** This Schema describes about IoT data packet */
@org.apache.avro.specific.AvroGenerated
public class RcvdData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3995747143888554273L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RcvdData\",\"namespace\":\"com.iot.data.schema\",\"doc\":\"This Schema describes about IoT data packet\",\"fields\":[{\"name\":\"deviceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"library\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"libraryVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appSecret\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"server_ip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"server_time\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"packet_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"UNIQUE_ID_ACTION\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}},{\"name\":\"packet\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PacketData\",\"fields\":[{\"name\":\"Install_Referrer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"InstallReferrerData\",\"fields\":[{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"referrer_String\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"screen\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ScreenData\",\"fields\":[{\"name\":\"screenId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"identity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"IdentityData\",\"fields\":[{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"events\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventsData\",\"fields\":[{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"event\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"position\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"stopSession\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"StopSessionData\",\"fields\":[{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"duration\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"PUSH_ACTION\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PushActionData\",\"fields\":[{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"PUSH_KEY\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"ADVERTISING_ID_ACTION\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AdvertisingIdActionData\",\"fields\":[{\"name\":\"ADVERTISING_ID_KEY\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ADVERTISING_ID_OPTOUT\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"startSession\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"StartSessionData\",\"fields\":[{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"screenName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"newDevice\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"NewDeviceData\",\"fields\":[{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"context\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ContextData\",\"fields\":[{\"name\":\"features\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FeaturesData\",\"fields\":[{\"name\":\"hasNFC\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasTelephony\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasGPS\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasAccelerometer\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasBarometer\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasCompass\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasGyroscope\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasLightsensor\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"hasProximity\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"bluetoothVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DisplayData\",\"fields\":[{\"name\":\"displayHeight\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"displayWidth\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"displayDensity\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null},{\"name\":\"totalMemory","Info\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TotalMemoryInfoData\",\"fields\":[{\"name\":\"totalRAM\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"totalStorage\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"deviceInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DeviceInfoData\",\"fields\":[{\"name\":\"sessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"appSessionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"context\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DevInfoContextData\",\"fields\":[{\"name\":\"appBuild\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AppBuildData\",\"fields\":[{\"name\":\"packageName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"versionCode\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"versionName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DeviceData\",\"fields\":[{\"name\":\"sdkVersion\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"releaseVersion\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceBrand\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceManufacturer\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceBoard\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceProduct\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"locale\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LocaleData\",\"fields\":[{\"name\":\"deviceCountry\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deviceLanguage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"location\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LocationData\",\"fields\":[{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"speed\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null},{\"name\":\"telephone\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TelephoneData\",\"fields\":[{\"name\":\"phoneCarrier\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"phoneRadio\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"inRoaming\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"wifi\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null,\"namespace\":\"com.iot.data.schema\"},{\"name\":\"bluetoothInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"BluetoothInfoData\",\"fields\":[{\"name\":\"bluetoothStatus\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"availableMemoryInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AvailableMemoryInfoData\",\"fields\":[{\"name\":\"availableRAM\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"availableStorage\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"cpuInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CpuInfoData\",\"fields\":[{\"name\":\"cpuTotal\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cpuIdle\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cpuUsage\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null},{\"name\":\"USER_AGENT_ACTION\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"UserAgentActionData\",\"fields\":[{\"name\":\"userAgent\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null,\"namespace\":\"com.iot.data.schema\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String deviceId;
  @Deprecated public java.lang.String library;
  @Deprecated public java.lang.String libraryVersion;
  @Deprecated public java.lang.String appSecret;
  @Deprecated public java.lang.String server_ip;
  @Deprecated public java.lang.String server_time;
  @Deprecated public java.lang.String packet_id;
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> UNIQUE_ID_ACTION;
  @Deprecated public java.util.List<com.iot.data.schema.PacketData> packet;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RcvdData() {}

  /**
   * All-args constructor.
   * @param deviceId The new value for deviceId
   * @param library The new value for library
   * @param libraryVersion The new value for libraryVersion
   * @param appSecret The new value for appSecret
   * @param server_ip The new value for server_ip
   * @param server_time The new value for server_time
   * @param packet_id The new value for packet_id
   * @param UNIQUE_ID_ACTION The new value for UNIQUE_ID_ACTION
   * @param packet The new value for packet
   */
  public RcvdData(java.lang.String deviceId, java.lang.String library, java.lang.String libraryVersion, java.lang.String appSecret, java.lang.String server_ip, java.lang.String server_time, java.lang.String packet_id, java.util.Map<java.lang.String,java.lang.String> UNIQUE_ID_ACTION, java.util.List<com.iot.data.schema.PacketData> packet) {
    this.deviceId = deviceId;
    this.library = library;
    this.libraryVersion = libraryVersion;
    this.appSecret = appSecret;
    this.server_ip = server_ip;
    this.server_time = server_time;
    this.packet_id = packet_id;
    this.UNIQUE_ID_ACTION = UNIQUE_ID_ACTION;
    this.packet = packet;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return deviceId;
    case 1: return library;
    case 2: return libraryVersion;
    case 3: return appSecret;
    case 4: return server_ip;
    case 5: return server_time;
    case 6: return packet_id;
    case 7: return UNIQUE_ID_ACTION;
    case 8: return packet;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: deviceId = (java.lang.String)value$; break;
    case 1: library = (java.lang.String)value$; break;
    case 2: libraryVersion = (java.lang.String)value$; break;
    case 3: appSecret = (java.lang.String)value$; break;
    case 4: server_ip = (java.lang.String)value$; break;
    case 5: server_time = (java.lang.String)value$; break;
    case 6: packet_id = (java.lang.String)value$; break;
    case 7: UNIQUE_ID_ACTION = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    case 8: packet = (java.util.List<com.iot.data.schema.PacketData>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'deviceId' field.
   * @return The value of the 'deviceId' field.
   */
  public java.lang.String getDeviceId() {
    return deviceId;
  }

  /**
   * Sets the value of the 'deviceId' field.
   * @param value the value to set.
   */
  public void setDeviceId(java.lang.String value) {
    this.deviceId = value;
  }

  /**
   * Gets the value of the 'library' field.
   * @return The value of the 'library' field.
   */
  public java.lang.String getLibrary() {
    return library;
  }

  /**
   * Sets the value of the 'library' field.
   * @param value the value to set.
   */
  public void setLibrary(java.lang.String value) {
    this.library = value;
  }

  /**
   * Gets the value of the 'libraryVersion' field.
   * @return The value of the 'libraryVersion' field.
   */
  public java.lang.String getLibraryVersion() {
    return libraryVersion;
  }

  /**
   * Sets the value of the 'libraryVersion' field.
   * @param value the value to set.
   */
  public void setLibraryVersion(java.lang.String value) {
    this.libraryVersion = value;
  }

  /**
   * Gets the value of the 'appSecret' field.
   * @return The value of the 'appSecret' field.
   */
  public java.lang.String getAppSecret() {
    return appSecret;
  }

  /**
   * Sets the value of the 'appSecret' field.
   * @param value the value to set.
   */
  public void setAppSecret(java.lang.String value) {
    this.appSecret = value;
  }

  /**
   * Gets the value of the 'server_ip' field.
   * @return The value of the 'server_ip' field.
   */
  public java.lang.String getServerIp() {
    return server_ip;
  }

  /**
   * Sets the value of the 'server_ip' field.
   * @param value the value to set.
   */
  public void setServerIp(java.lang.String value) {
    this.server_ip = value;
  }

  /**
   * Gets the value of the 'server_time' field.
   * @return The value of the 'server_time' field.
   */
  public java.lang.String getServerTime() {
    return server_time;
  }

  /**
   * Sets the value of the 'server_time' field.
   * @param value the value to set.
   */
  public void setServerTime(java.lang.String value) {
    this.server_time = value;
  }

  /**
   * Gets the value of the 'packet_id' field.
   * @return The value of the 'packet_id' field.
   */
  public java.lang.String getPacketId() {
    return packet_id;
  }

  /**
   * Sets the value of the 'packet_id' field.
   * @param value the value to set.
   */
  public void setPacketId(java.lang.String value) {
    this.packet_id = value;
  }

  /**
   * Gets the value of the 'UNIQUE_ID_ACTION' field.
   * @return The value of the 'UNIQUE_ID_ACTION' field.
   */
  public java.util.Map<java.lang.String,java.lang.String> getUNIQUEIDACTION() {
    return UNIQUE_ID_ACTION;
  }

  /**
   * Sets the value of the 'UNIQUE_ID_ACTION' field.
   * @param value the value to set.
   */
  public void setUNIQUEIDACTION(java.util.Map<java.lang.String,java.lang.String> value) {
    this.UNIQUE_ID_ACTION = value;
  }

  /**
   * Gets the value of the 'packet' field.
   * @return The value of the 'packet' field.
   */
  public java.util.List<com.iot.data.schema.PacketData> getPacket() {
    return packet;
  }

  /**
   * Sets the value of the 'packet' field.
   * @param value the value to set.
   */
  public void setPacket(java.util.List<com.iot.data.schema.PacketData> value) {
    this.packet = value;
  }

  /**
   * Creates a new RcvdData RecordBuilder.
   * @return A new RcvdData RecordBuilder
   */
  public static com.iot.data.schema.RcvdData.Builder newBuilder() {
    return new com.iot.data.schema.RcvdData.Builder();
  }

  /**
   * Creates a new RcvdData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RcvdData RecordBuilder
   */
  public static com.iot.data.schema.RcvdData.Builder newBuilder(com.iot.data.schema.RcvdData.Builder other) {
    return new com.iot.data.schema.RcvdData.Builder(other);
  }

  /**
   * Creates a new RcvdData RecordBuilder by copying an existing RcvdData instance.
   * @param other The existing instance to copy.
   * @return A new RcvdData RecordBuilder
   */
  public static com.iot.data.schema.RcvdData.Builder newBuilder(com.iot.data.schema.RcvdData other) {
    return new com.iot.data.schema.RcvdData.Builder(other);
  }

  /**
   * RecordBuilder for RcvdData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RcvdData>
    implements org.apache.avro.data.RecordBuilder<RcvdData> {

    private java.lang.String deviceId;
    private java.lang.String library;
    private java.lang.String libraryVersion;
    private java.lang.String appSecret;
    private java.lang.String server_ip;
    private java.lang.String server_time;
    private java.lang.String packet_id;
    private java.util.Map<java.lang.String,java.lang.String> UNIQUE_ID_ACTION;
    private java.util.List<com.iot.data.schema.PacketData> packet;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.iot.data.schema.RcvdData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.deviceId)) {
        this.deviceId = data().deepCopy(fields()[0].schema(), other.deviceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.library)) {
        this.library = data().deepCopy(fields()[1].schema(), other.library);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.libraryVersion)) {
        this.libraryVersion = data().deepCopy(fields()[2].schema(), other.libraryVersion);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.appSecret)) {
        this.appSecret = data().deepCopy(fields()[3].schema(), other.appSecret);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.server_ip)) {
        this.server_ip = data().deepCopy(fields()[4].schema(), other.server_ip);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.server_time)) {
        this.server_time = data().deepCopy(fields()[5].schema(), other.server_time);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.packet_id)) {
        this.packet_id = data().deepCopy(fields()[6].schema(), other.packet_id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.UNIQUE_ID_ACTION)) {
        this.UNIQUE_ID_ACTION = data().deepCopy(fields()[7].schema(), other.UNIQUE_ID_ACTION);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.packet)) {
        this.packet = data().deepCopy(fields()[8].schema(), other.packet);
        fieldSetFlags()[8] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RcvdData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.iot.data.schema.RcvdData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.deviceId)) {
        this.deviceId = data().deepCopy(fields()[0].schema(), other.deviceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.library)) {
        this.library = data().deepCopy(fields()[1].schema(), other.library);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.libraryVersion)) {
        this.libraryVersion = data().deepCopy(fields()[2].schema(), other.libraryVersion);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.appSecret)) {
        this.appSecret = data().deepCopy(fields()[3].schema(), other.appSecret);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.server_ip)) {
        this.server_ip = data().deepCopy(fields()[4].schema(), other.server_ip);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.server_time)) {
        this.server_time = data().deepCopy(fields()[5].schema(), other.server_time);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.packet_id)) {
        this.packet_id = data().deepCopy(fields()[6].schema(), other.packet_id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.UNIQUE_ID_ACTION)) {
        this.UNIQUE_ID_ACTION = data().deepCopy(fields()[7].schema(), other.UNIQUE_ID_ACTION);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.packet)) {
        this.packet = data().deepCopy(fields()[8].schema(), other.packet);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'deviceId' field.
      * @return The value.
      */
    public java.lang.String getDeviceId() {
      return deviceId;
    }

    /**
      * Sets the value of the 'deviceId' field.
      * @param value The value of 'deviceId'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setDeviceId(java.lang.String value) {
      validate(fields()[0], value);
      this.deviceId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'deviceId' field has been set.
      * @return True if the 'deviceId' field has been set, false otherwise.
      */
    public boolean hasDeviceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'deviceId' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearDeviceId() {
      deviceId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'library' field.
      * @return The value.
      */
    public java.lang.String getLibrary() {
      return library;
    }

    /**
      * Sets the value of the 'library' field.
      * @param value The value of 'library'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setLibrary(java.lang.String value) {
      validate(fields()[1], value);
      this.library = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'library' field has been set.
      * @return True if the 'library' field has been set, false otherwise.
      */
    public boolean hasLibrary() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'library' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearLibrary() {
      library = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'libraryVersion' field.
      * @return The value.
      */
    public java.lang.String getLibraryVersion() {
      return libraryVersion;
    }

    /**
      * Sets the value of the 'libraryVersion' field.
      * @param value The value of 'libraryVersion'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setLibraryVersion(java.lang.String value) {
      validate(fields()[2], value);
      this.libraryVersion = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'libraryVersion' field has been set.
      * @return True if the 'libraryVersion' field has been set, false otherwise.
      */
    public boolean hasLibraryVersion() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'libraryVersion' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearLibraryVersion() {
      libraryVersion = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'appSecret' field.
      * @return The value.
      */
    public java.lang.String getAppSecret() {
      return appSecret;
    }

    /**
      * Sets the value of the 'appSecret' field.
      * @param value The value of 'appSecret'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setAppSecret(java.lang.String value) {
      validate(fields()[3], value);
      this.appSecret = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'appSecret' field has been set.
      * @return True if the 'appSecret' field has been set, false otherwise.
      */
    public boolean hasAppSecret() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'appSecret' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearAppSecret() {
      appSecret = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'server_ip' field.
      * @return The value.
      */
    public java.lang.String getServerIp() {
      return server_ip;
    }

    /**
      * Sets the value of the 'server_ip' field.
      * @param value The value of 'server_ip'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setServerIp(java.lang.String value) {
      validate(fields()[4], value);
      this.server_ip = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'server_ip' field has been set.
      * @return True if the 'server_ip' field has been set, false otherwise.
      */
    public boolean hasServerIp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'server_ip' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearServerIp() {
      server_ip = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'server_time' field.
      * @return The value.
      */
    public java.lang.String getServerTime() {
      return server_time;
    }

    /**
      * Sets the value of the 'server_time' field.
      * @param value The value of 'server_time'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setServerTime(java.lang.String value) {
      validate(fields()[5], value);
      this.server_time = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'server_time' field has been set.
      * @return True if the 'server_time' field has been set, false otherwise.
      */
    public boolean hasServerTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'server_time' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearServerTime() {
      server_time = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'packet_id' field.
      * @return The value.
      */
    public java.lang.String getPacketId() {
      return packet_id;
    }

    /**
      * Sets the value of the 'packet_id' field.
      * @param value The value of 'packet_id'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setPacketId(java.lang.String value) {
      validate(fields()[6], value);
      this.packet_id = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'packet_id' field has been set.
      * @return True if the 'packet_id' field has been set, false otherwise.
      */
    public boolean hasPacketId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'packet_id' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearPacketId() {
      packet_id = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'UNIQUE_ID_ACTION' field.
      * @return The value.
      */
    public java.util.Map<java.lang.String,java.lang.String> getUNIQUEIDACTION() {
      return UNIQUE_ID_ACTION;
    }

    /**
      * Sets the value of the 'UNIQUE_ID_ACTION' field.
      * @param value The value of 'UNIQUE_ID_ACTION'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setUNIQUEIDACTION(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[7], value);
      this.UNIQUE_ID_ACTION = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'UNIQUE_ID_ACTION' field has been set.
      * @return True if the 'UNIQUE_ID_ACTION' field has been set, false otherwise.
      */
    public boolean hasUNIQUEIDACTION() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'UNIQUE_ID_ACTION' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearUNIQUEIDACTION() {
      UNIQUE_ID_ACTION = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'packet' field.
      * @return The value.
      */
    public java.util.List<com.iot.data.schema.PacketData> getPacket() {
      return packet;
    }

    /**
      * Sets the value of the 'packet' field.
      * @param value The value of 'packet'.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder setPacket(java.util.List<com.iot.data.schema.PacketData> value) {
      validate(fields()[8], value);
      this.packet = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'packet' field has been set.
      * @return True if the 'packet' field has been set, false otherwise.
      */
    public boolean hasPacket() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'packet' field.
      * @return This builder.
      */
    public com.iot.data.schema.RcvdData.Builder clearPacket() {
      packet = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public RcvdData build() {
      try {
        RcvdData record = new RcvdData();
        record.deviceId = fieldSetFlags()[0] ? this.deviceId : (java.lang.String) defaultValue(fields()[0]);
        record.library = fieldSetFlags()[1] ? this.library : (java.lang.String) defaultValue(fields()[1]);
        record.libraryVersion = fieldSetFlags()[2] ? this.libraryVersion : (java.lang.String) defaultValue(fields()[2]);
        record.appSecret = fieldSetFlags()[3] ? this.appSecret : (java.lang.String) defaultValue(fields()[3]);
        record.server_ip = fieldSetFlags()[4] ? this.server_ip : (java.lang.String) defaultValue(fields()[4]);
        record.server_time = fieldSetFlags()[5] ? this.server_time : (java.lang.String) defaultValue(fields()[5]);
        record.packet_id = fieldSetFlags()[6] ? this.packet_id : (java.lang.String) defaultValue(fields()[6]);
        record.UNIQUE_ID_ACTION = fieldSetFlags()[7] ? this.UNIQUE_ID_ACTION : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[7]);
        record.packet = fieldSetFlags()[8] ? this.packet : (java.util.List<com.iot.data.schema.PacketData>) defaultValue(fields()[8]);
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