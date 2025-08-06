package module2.ss8_CleanCode.repository;

import module2.ss8_CleanCode.entity.Motorbike;

import java.util.List;

public interface MotorbikeRepoInterface {
    public void add(Motorbike motorbike);
    public boolean remove(Motorbike motorbike);
    public List<Motorbike> findAllMotorbikes();
}
