package com.example.session01;

class StudentImp implements students {
    private String name;
    private String classname;
    private String vehicleType;
    private String numberPlate;

    public StudentImp(String name, String classname, String vehicleType, String numberPlate) {
        this.name = name;
        this.classname = classname;
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassname() {
        return classname;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String getNumberPlate() {
        return numberPlate;
    }
}
