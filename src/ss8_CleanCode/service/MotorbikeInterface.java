package ss8_CleanCode.service;


import ss8_CleanCode.entity.Motorbike;

import java.util.List;

public interface MotorbikeInterface {
    void addMotorbike(Motorbike motorbike);
    List<Motorbike> showAllMotorbikes();
}
