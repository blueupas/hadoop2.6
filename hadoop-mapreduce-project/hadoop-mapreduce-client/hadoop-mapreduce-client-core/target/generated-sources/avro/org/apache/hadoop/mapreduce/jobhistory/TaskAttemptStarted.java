/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TaskAttemptStarted extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TaskAttemptStarted\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"startTime\",\"type\":\"long\"},{\"name\":\"trackerName\",\"type\":\"string\"},{\"name\":\"httpPort\",\"type\":\"int\"},{\"name\":\"shufflePort\",\"type\":\"int\"},{\"name\":\"containerId\",\"type\":\"string\"},{\"name\":\"locality\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"avataar\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence taskid;
  @Deprecated public java.lang.CharSequence taskType;
  @Deprecated public java.lang.CharSequence attemptId;
  @Deprecated public long startTime;
  @Deprecated public java.lang.CharSequence trackerName;
  @Deprecated public int httpPort;
  @Deprecated public int shufflePort;
  @Deprecated public java.lang.CharSequence containerId;
  @Deprecated public java.lang.CharSequence locality;
  @Deprecated public java.lang.CharSequence avataar;

  /**
   * Default constructor.
   */
  public TaskAttemptStarted() {}

  /**
   * All-args constructor.
   */
  public TaskAttemptStarted(java.lang.CharSequence taskid, java.lang.CharSequence taskType, java.lang.CharSequence attemptId, java.lang.Long startTime, java.lang.CharSequence trackerName, java.lang.Integer httpPort, java.lang.Integer shufflePort, java.lang.CharSequence containerId, java.lang.CharSequence locality, java.lang.CharSequence avataar) {
    this.taskid = taskid;
    this.taskType = taskType;
    this.attemptId = attemptId;
    this.startTime = startTime;
    this.trackerName = trackerName;
    this.httpPort = httpPort;
    this.shufflePort = shufflePort;
    this.containerId = containerId;
    this.locality = locality;
    this.avataar = avataar;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return taskid;
    case 1: return taskType;
    case 2: return attemptId;
    case 3: return startTime;
    case 4: return trackerName;
    case 5: return httpPort;
    case 6: return shufflePort;
    case 7: return containerId;
    case 8: return locality;
    case 9: return avataar;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: taskid = (java.lang.CharSequence)value$; break;
    case 1: taskType = (java.lang.CharSequence)value$; break;
    case 2: attemptId = (java.lang.CharSequence)value$; break;
    case 3: startTime = (java.lang.Long)value$; break;
    case 4: trackerName = (java.lang.CharSequence)value$; break;
    case 5: httpPort = (java.lang.Integer)value$; break;
    case 6: shufflePort = (java.lang.Integer)value$; break;
    case 7: containerId = (java.lang.CharSequence)value$; break;
    case 8: locality = (java.lang.CharSequence)value$; break;
    case 9: avataar = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'taskid' field.
   */
  public java.lang.CharSequence getTaskid() {
    return taskid;
  }

  /**
   * Sets the value of the 'taskid' field.
   * @param value the value to set.
   */
  public void setTaskid(java.lang.CharSequence value) {
    this.taskid = value;
  }

  /**
   * Gets the value of the 'taskType' field.
   */
  public java.lang.CharSequence getTaskType() {
    return taskType;
  }

  /**
   * Sets the value of the 'taskType' field.
   * @param value the value to set.
   */
  public void setTaskType(java.lang.CharSequence value) {
    this.taskType = value;
  }

  /**
   * Gets the value of the 'attemptId' field.
   */
  public java.lang.CharSequence getAttemptId() {
    return attemptId;
  }

  /**
   * Sets the value of the 'attemptId' field.
   * @param value the value to set.
   */
  public void setAttemptId(java.lang.CharSequence value) {
    this.attemptId = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * @param value the value to set.
   */
  public void setStartTime(java.lang.Long value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'trackerName' field.
   */
  public java.lang.CharSequence getTrackerName() {
    return trackerName;
  }

  /**
   * Sets the value of the 'trackerName' field.
   * @param value the value to set.
   */
  public void setTrackerName(java.lang.CharSequence value) {
    this.trackerName = value;
  }

  /**
   * Gets the value of the 'httpPort' field.
   */
  public java.lang.Integer getHttpPort() {
    return httpPort;
  }

  /**
   * Sets the value of the 'httpPort' field.
   * @param value the value to set.
   */
  public void setHttpPort(java.lang.Integer value) {
    this.httpPort = value;
  }

  /**
   * Gets the value of the 'shufflePort' field.
   */
  public java.lang.Integer getShufflePort() {
    return shufflePort;
  }

  /**
   * Sets the value of the 'shufflePort' field.
   * @param value the value to set.
   */
  public void setShufflePort(java.lang.Integer value) {
    this.shufflePort = value;
  }

  /**
   * Gets the value of the 'containerId' field.
   */
  public java.lang.CharSequence getContainerId() {
    return containerId;
  }

  /**
   * Sets the value of the 'containerId' field.
   * @param value the value to set.
   */
  public void setContainerId(java.lang.CharSequence value) {
    this.containerId = value;
  }

  /**
   * Gets the value of the 'locality' field.
   */
  public java.lang.CharSequence getLocality() {
    return locality;
  }

  /**
   * Sets the value of the 'locality' field.
   * @param value the value to set.
   */
  public void setLocality(java.lang.CharSequence value) {
    this.locality = value;
  }

  /**
   * Gets the value of the 'avataar' field.
   */
  public java.lang.CharSequence getAvataar() {
    return avataar;
  }

  /**
   * Sets the value of the 'avataar' field.
   * @param value the value to set.
   */
  public void setAvataar(java.lang.CharSequence value) {
    this.avataar = value;
  }

  /** Creates a new TaskAttemptStarted RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder();
  }
  
  /** Creates a new TaskAttemptStarted RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder(other);
  }
  
  /** Creates a new TaskAttemptStarted RecordBuilder by copying an existing TaskAttemptStarted instance */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted other) {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder(other);
  }
  
  /**
   * RecordBuilder for TaskAttemptStarted instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TaskAttemptStarted>
    implements org.apache.avro.data.RecordBuilder<TaskAttemptStarted> {

    private java.lang.CharSequence taskid;
    private java.lang.CharSequence taskType;
    private java.lang.CharSequence attemptId;
    private long startTime;
    private java.lang.CharSequence trackerName;
    private int httpPort;
    private int shufflePort;
    private java.lang.CharSequence containerId;
    private java.lang.CharSequence locality;
    private java.lang.CharSequence avataar;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing TaskAttemptStarted instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted other) {
            super(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.SCHEMA$);
      if (isValidValue(fields()[0], other.taskid)) {
        this.taskid = data().deepCopy(fields()[0].schema(), other.taskid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.taskType)) {
        this.taskType = data().deepCopy(fields()[1].schema(), other.taskType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attemptId)) {
        this.attemptId = data().deepCopy(fields()[2].schema(), other.attemptId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.trackerName)) {
        this.trackerName = data().deepCopy(fields()[4].schema(), other.trackerName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.httpPort)) {
        this.httpPort = data().deepCopy(fields()[5].schema(), other.httpPort);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.shufflePort)) {
        this.shufflePort = data().deepCopy(fields()[6].schema(), other.shufflePort);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.containerId)) {
        this.containerId = data().deepCopy(fields()[7].schema(), other.containerId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.locality)) {
        this.locality = data().deepCopy(fields()[8].schema(), other.locality);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.avataar)) {
        this.avataar = data().deepCopy(fields()[9].schema(), other.avataar);
        fieldSetFlags()[9] = true;
      }
    }

    /** Gets the value of the 'taskid' field */
    public java.lang.CharSequence getTaskid() {
      return taskid;
    }
    
    /** Sets the value of the 'taskid' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setTaskid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.taskid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'taskid' field has been set */
    public boolean hasTaskid() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'taskid' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearTaskid() {
      taskid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'taskType' field */
    public java.lang.CharSequence getTaskType() {
      return taskType;
    }
    
    /** Sets the value of the 'taskType' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setTaskType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.taskType = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'taskType' field has been set */
    public boolean hasTaskType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'taskType' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearTaskType() {
      taskType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'attemptId' field */
    public java.lang.CharSequence getAttemptId() {
      return attemptId;
    }
    
    /** Sets the value of the 'attemptId' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setAttemptId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.attemptId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'attemptId' field has been set */
    public boolean hasAttemptId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'attemptId' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearAttemptId() {
      attemptId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'startTime' field */
    public java.lang.Long getStartTime() {
      return startTime;
    }
    
    /** Sets the value of the 'startTime' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setStartTime(long value) {
      validate(fields()[3], value);
      this.startTime = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'startTime' field has been set */
    public boolean hasStartTime() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'startTime' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearStartTime() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'trackerName' field */
    public java.lang.CharSequence getTrackerName() {
      return trackerName;
    }
    
    /** Sets the value of the 'trackerName' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setTrackerName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.trackerName = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'trackerName' field has been set */
    public boolean hasTrackerName() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'trackerName' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearTrackerName() {
      trackerName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'httpPort' field */
    public java.lang.Integer getHttpPort() {
      return httpPort;
    }
    
    /** Sets the value of the 'httpPort' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setHttpPort(int value) {
      validate(fields()[5], value);
      this.httpPort = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'httpPort' field has been set */
    public boolean hasHttpPort() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'httpPort' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearHttpPort() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'shufflePort' field */
    public java.lang.Integer getShufflePort() {
      return shufflePort;
    }
    
    /** Sets the value of the 'shufflePort' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setShufflePort(int value) {
      validate(fields()[6], value);
      this.shufflePort = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'shufflePort' field has been set */
    public boolean hasShufflePort() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'shufflePort' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearShufflePort() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'containerId' field */
    public java.lang.CharSequence getContainerId() {
      return containerId;
    }
    
    /** Sets the value of the 'containerId' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setContainerId(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.containerId = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'containerId' field has been set */
    public boolean hasContainerId() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'containerId' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearContainerId() {
      containerId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'locality' field */
    public java.lang.CharSequence getLocality() {
      return locality;
    }
    
    /** Sets the value of the 'locality' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setLocality(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.locality = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'locality' field has been set */
    public boolean hasLocality() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'locality' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearLocality() {
      locality = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'avataar' field */
    public java.lang.CharSequence getAvataar() {
      return avataar;
    }
    
    /** Sets the value of the 'avataar' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder setAvataar(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.avataar = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'avataar' field has been set */
    public boolean hasAvataar() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'avataar' field */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptStarted.Builder clearAvataar() {
      avataar = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public TaskAttemptStarted build() {
      try {
        TaskAttemptStarted record = new TaskAttemptStarted();
        record.taskid = fieldSetFlags()[0] ? this.taskid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.taskType = fieldSetFlags()[1] ? this.taskType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.attemptId = fieldSetFlags()[2] ? this.attemptId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.startTime = fieldSetFlags()[3] ? this.startTime : (java.lang.Long) defaultValue(fields()[3]);
        record.trackerName = fieldSetFlags()[4] ? this.trackerName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.httpPort = fieldSetFlags()[5] ? this.httpPort : (java.lang.Integer) defaultValue(fields()[5]);
        record.shufflePort = fieldSetFlags()[6] ? this.shufflePort : (java.lang.Integer) defaultValue(fields()[6]);
        record.containerId = fieldSetFlags()[7] ? this.containerId : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.locality = fieldSetFlags()[8] ? this.locality : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.avataar = fieldSetFlags()[9] ? this.avataar : (java.lang.CharSequence) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
