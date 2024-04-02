
public class BloodData {
    private BloodType bloodType;
    private BloodFactor rhFactor;

    public BloodData() {
        bloodType = BloodType.O;
        rhFactor = BloodFactor.POSITIVE;
    }

    public BloodData(BloodType bloodType, BloodFactor rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public BloodFactor getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(BloodFactor rhFactor) {
        this.rhFactor = rhFactor;
    }
}

