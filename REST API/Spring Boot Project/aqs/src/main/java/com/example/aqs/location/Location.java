package com.example.aqs.location;

import com.example.aqs.devices.Devices;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name="location")
public class Location {

@Id
@GeneratedValue
Long id;
//Long deviceid;
Time locationtime;
String longitude;
String Latitude;
Boolean status;
String createdby;
Time createdat;
String updatedby;
Time updatedat;


    @ManyToOne(fetch=FetchType.EAGER,cascade={CascadeType.ALL})
    @JoinColumn(name="device_id", referencedColumnName = "id")
    private Devices device;

    public Devices getDevice() {
        return device;
    }

    public void setDevice(Devices device) {
        this.device = device;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  /*  public Long getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Long deviceid) {
        this.deviceid = deviceid;
    }
*/
    public Time getLocationtime() {
        return locationtime;
    }

    public void setLocationtime(Time locationtime) {
        this.locationtime = locationtime;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Time getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Time createdat) {
        this.createdat = createdat;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    public Time getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Time updatedat) {
        this.updatedat = updatedat;
    }
}