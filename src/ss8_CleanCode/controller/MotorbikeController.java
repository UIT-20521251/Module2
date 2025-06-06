package ss8_CleanCode.controller;


import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.service.*;

import java.util.List;

public class MotorbikeController {
    private MotorbikeInterface motorbikeService = new MotorbikeService();

    public void add(Motorbike motorbike){
        motorbikeService.addMotorbike(motorbike);
    }
    public List<Motorbike> showAllMotorbikes(){
        return motorbikeService.showAllMotorbikes();
    }
    public void remove(String plate){
        motorbikeService.removeMotorbike(motorbikeService.findMotorbikeByPlate(plate));
    }
}
