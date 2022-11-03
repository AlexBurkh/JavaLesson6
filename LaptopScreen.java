public class LaptopScreen {
    private double diagonal;
    private LaptopScreenMatrixType matrixType;
    private LaptopScreenResolution resolution;
    private double responseTime;

    public LaptopScreen(double diagonal, LaptopScreenMatrixType matrixType, LaptopScreenResolution resolution,
                        double responseTime) {
        this.diagonal = diagonal;
        this.matrixType = matrixType;
        this.resolution = resolution;
        this.responseTime = responseTime;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public LaptopScreenMatrixType getMatrixType() {
        return matrixType;
    }

    public LaptopScreenResolution getResolution() {
        return resolution;
    }

    public double getResponseTime() {
        return responseTime;
    }
}
