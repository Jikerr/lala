package com.lala.common.entity.house;

import com.lala.common.entity.base.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:34 2018/2/8
 * @Modified By :
 */
@Table(name = "wco_house")
@Entity
public class House extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String houseNum;//房屋编号
    private String buildingName;//楼盘名称
    private String buildingAddress;//楼盘具体地址
    private BigDecimal buildingAddressLongitude;//楼盘地址经度
    private BigDecimal buildingAddressLatitude;//楼盘地址纬度
    private String houseAddress;//房屋地址
    private String houseAddressProvince;//所处省份
    private String houseAddressCity;//所处城市
    private String houseAddressArea;//所属
    private Integer floor;//楼层
    private Integer roomNum;//房间号
    private Integer countRoom;//室
    private Integer countHall;//厅
    private Integer countToilet;//卫生间
    private Integer areaSize;//面基
    private String orientation;//朝向
    private BigDecimal rent;//租金
    private Integer mortgageMonth;//押
    private Integer payMonth;//付
    //private Integer fixedCharges;
    //private Integer houseConfigure;//房屋配置
    private String decorateType;//装修情况

    @OneToMany
    @JoinColumn(name = "fixed_charges_id")
    private List<FixedCharges> fixedCharges;

    public List<FixedCharges> getFixedCharges() {
        return fixedCharges;
    }
    public void setFixedCharges(List<FixedCharges> fixedCharges) {
        this.fixedCharges = fixedCharges;
    }

    @OneToMany
    @JoinColumn(name = "house_configures_id")
    private List<HouseConfigure> houseConfigures;

    public List<HouseConfigure> getHouseConfigures() {
        return houseConfigures;
    }
    public void setHouseConfigures(List<HouseConfigure> houseConfigures) {
        this.houseConfigures = houseConfigures;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public BigDecimal getBuildingAddressLongitude() {
        return buildingAddressLongitude;
    }

    public void setBuildingAddressLongitude(BigDecimal buildingAddressLongitude) {
        this.buildingAddressLongitude = buildingAddressLongitude;
    }

    public BigDecimal getBuildingAddressLatitude() {
        return buildingAddressLatitude;
    }

    public void setBuildingAddressLatitude(BigDecimal buildingAddressLatitude) {
        this.buildingAddressLatitude = buildingAddressLatitude;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseAddressProvince() {
        return houseAddressProvince;
    }

    public void setHouseAddressProvince(String houseAddressProvince) {
        this.houseAddressProvince = houseAddressProvince;
    }

    public String getHouseAddressCity() {
        return houseAddressCity;
    }

    public void setHouseAddressCity(String houseAddressCity) {
        this.houseAddressCity = houseAddressCity;
    }

    public String getHouseAddressArea() {
        return houseAddressArea;
    }

    public void setHouseAddressArea(String houseAddressArea) {
        this.houseAddressArea = houseAddressArea;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(Integer countRoom) {
        this.countRoom = countRoom;
    }

    public Integer getCountHall() {
        return countHall;
    }

    public void setCountHall(Integer countHall) {
        this.countHall = countHall;
    }

    public Integer getCountToilet() {
        return countToilet;
    }

    public void setCountToilet(Integer countToilet) {
        this.countToilet = countToilet;
    }

    public Integer getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(Integer areaSize) {
        this.areaSize = areaSize;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public BigDecimal getRent() {
        return rent;
    }

    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    public Integer getMortgageMonth() {
        return mortgageMonth;
    }

    public void setMortgageMonth(Integer mortgageMonth) {
        this.mortgageMonth = mortgageMonth;
    }

    public Integer getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(Integer payMonth) {
        this.payMonth = payMonth;
    }

    public String getDecorateType() {
        return decorateType;
    }

    public void setDecorateType(String decorateType) {
        this.decorateType = decorateType;
    }
}
