package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndLaptopList {
    // TODO: 20.05.2023 Добавить стоимость
    private List<Laptop> randomList = new ArrayList<>();
    private List<CPU> cpus;
    private List<GPU> gpus;
    private List<RAM> rams;
    private List<ROM> roms;
    private List<OS> oss;
    private Integer length;


    public RndLaptopList(boolean repeats) {
        this.cpus = getCPUs();
        this.gpus = getGPUs();
        this.rams = getRAMs();
        this.roms = getROMs();
        this.oss = getOS();
        this.length = getMaxLength();

        if (repeats) {
            for (int i = 0; i < this.length; i++) {
                randomList.add(new Laptop(rndCPU(), rndGPU(), rndRAM(), rndROM(), rndOS()));
            }
        } else {
            // TODO 5 вложенных циклов не самое лучшее решение, подумать над альтернативой без применения рекурсии
            for (CPU cpu : cpus) {
                for (GPU gpu : gpus) {
                    for (RAM ram : rams) {
                        for (ROM rom : roms) {
                            for (OS os : oss) {
                                randomList.add(new Laptop(cpu, gpu, ram, rom, os));
                            }
                        }
                    }
                }
            }

        }
    }

    public RndLaptopList(Integer length, boolean repeats) {
        this.cpus = getCPUs();
        this.gpus = getGPUs();
        this.rams = getRAMs();
        this.roms = getROMs();
        this.oss = getOS();
        this.length = getMaxLength();

        if (this.length < length) length = this.length;

        if (repeats) {
            for (int i = 0; i < this.length; i++) {
                randomList.add(new Laptop(rndCPU(), rndGPU(), rndRAM(), rndROM(), rndOS()));
            }
        } else {
            int count = 0;
            while (count < length) {
                CPU cpu = rndCPU();
                GPU gpu = rndGPU();
                RAM ram = rndRAM();
                ROM rom = rndROM();
                OS os = rndOS();

                Laptop laptop = new Laptop(cpu, gpu, ram, rom, os);
                if (randomList.contains(laptop)) continue;
                else randomList.add(laptop);
                count++;
            }

        }
    }

    public List<Laptop> getRandomList() {
        return randomList;
    }

    private Integer getMaxLength() {
        return cpus.size() *  gpus.size() * rams.size() * roms.size() * oss.size();
    }

    public Integer getLength() {
        return length;
    }

    private int choice(int bound) {
        return new Random().nextInt(bound);
    }

    private List<CPU> getCPUs() {
        CPU cpu7950X3D = new CPU("AMD", "Ryzen™ 9 7950X3D", 16, 32, 4.2, 5.7);
        CPU cpu7950X = new CPU("AMD", "Ryzen™ 9 7950X", 16, 32, 4.5, 5.7);
        CPU cpu7900X3D = new CPU("AMD", "Ryzen™ 9 7900X3D", 12, 24, 4.4, 5.6);
        CPU cpu7900X = new CPU("AMD", "Ryzen™ 9 7900X", 12, 24, 4.7, 5.6);
        CPU cpu7900 = new CPU("AMD", "Ryzen™ 9 7900", 12, 24, 3.7, 5.4);
        CPU cpu7800X3D = new CPU("AMD", "Ryzen™ 7 7800X3D", 8, 16, 4.2, 5.0);
        CPU cpu7700X = new CPU("AMD", "Ryzen™ 7 7700X", 8, 16, 4.5, 5.4);
        CPU cpu7700 = new CPU("AMD", "Ryzen™ 7 7700", 8, 16, 3.8, 5.3);
        CPU cpu7600X = new CPU("AMD", "Ryzen™ 5 7600X", 6, 12, 4.7, 5.3);
        CPU cpu7600 = new CPU("AMD", "Ryzen™ 5 7600", 6, 12, 3.8, 5.1);
        CPU cpu13905H = new CPU("Intel®", "Core™ i9-13905H", 14, 20, 4.1, 5.4);
        CPU cpu13900H= new CPU("Intel®", "Core™ i9-13900H", 14, 20, 4.1, 5.4);
        CPU cpu13980HX = new CPU("Intel®", "Core™ i9-13980HX", 24, 32, 4.0, 5.6);
        CPU cpu13700HX = new CPU("Intel®", "Core™ i7-13700HX", 16, 24, 3.7, 5.0);
        CPU cpu1360P = new CPU("Intel®", "Core™ i7-1360P", 12, 16, 3.7, 5.0);
        CPU cpu1355U = new CPU("Intel®", "Core™ i7-1355U", 10, 12, 3.7, 5.0);
        CPU cpu13400 = new CPU("Intel®", "Core™ i5-13400", 10, 16, 1.8, 4.6);
        CPU cpu1340PE = new CPU("Intel®", "Core™ i5-1340PE", 12, 16, 1.8, 4.5);
        CPU cpu1334U = new CPU("Intel®", "Core™ i5-1334U", 10, 12, 3.4, 4.6);
        CPU cpu1315U = new CPU("Intel®", "Core™ i3-1315U", 6, 8, 3.3, 4.5);
        CPU cpu1305U = new CPU("Intel®", "Core™ i3-1305U", 5, 6, 3.3, 4.5);

        List<CPU> cpus = new ArrayList<>();
        cpus.add(cpu7950X3D);
        cpus.add(cpu7950X);
        cpus.add(cpu7900X3D);
        cpus.add(cpu7900X);
        cpus.add(cpu7900);
        cpus.add(cpu7800X3D);
        cpus.add(cpu7700X);
        cpus.add(cpu7700);
        cpus.add(cpu7600X);
        cpus.add(cpu7600);
        cpus.add(cpu13905H);
        cpus.add(cpu13900H);
        cpus.add(cpu13980HX);
        cpus.add(cpu13700HX);
        cpus.add(cpu1360P);
        cpus.add(cpu1355U);
        cpus.add(cpu13400);
        cpus.add(cpu1340PE);
        cpus.add(cpu1334U);
        cpus.add(cpu1315U);
        cpus.add(cpu1305U);

        return cpus;
    }

    private CPU rndCPU() {
        return cpus.get(choice(cpus.size()));
    }

    private List<GPU> getGPUs() {
        GPU gpu7600MXT= new GPU("AMD", "AMD Radeon™ RX 7600M XT", 2.3, 8, "GDDR6");
        GPU gpu7600M = new GPU("AMD", "Radeon™ RX 7600M", 2.07, 8, "GDDR6");
        GPU gpu6850MXT = new GPU("AMD", "Radeon™ RX 6850M XT", 2.463, 12, "GDDR6");
        GPU gpu6800M = new GPU("AMD", "Radeon™ RX 6800M", 2.3, 12, "GDDR6");
        GPU gpu6700M = new GPU("AMD", "Radeon™ RX 6700M", 2.3, 10, "GDDR6");
        GPU gpu6650MXT = new GPU("AMD", "Radeon™ RX 6650M XT", 2.162, 8, "GDDR6");
        GPU gpu6650M = new GPU("AMD", "Radeon™ RX 6650M", 2.222, 8, "GDDR6");
        GPU gpu6600M = new GPU("AMD", "Radeon™ RX 6600M", 2.177, 8, "GDDR6");
        GPU gpu6550M = new GPU("AMD", "Radeon™ RX 6550M", 2.56, 4, "GDDR6");
        GPU gpu6500M = new GPU("AMD", "Radeon™ RX 6500M", 2.191, 4, "GDDR6");
        GPU gpu6450M = new GPU("AMD", "Radeon™ RX 6450M", 2.22, 4, "GDDR6");
        GPU gpu6300M = new GPU("AMD", "Radeon™ RX 6300M", 1.512, 2, "GDDR6");
        GPU gpu4090 = new GPU("NVIDIA", "GeForce RTX 4090", 2.52, 24, "GDDR6X");
        GPU gpu4080 = new GPU("NVIDIA", "GeForce RTX 4080", 2.51, 16, "GDDR6X");
        GPU gpu4070Ti = new GPU("NVIDIA", "GeForce RTX 4070 Ti", 2.61, 12, "GDDR6X");
        GPU gpu4070 = new GPU("NVIDIA", "GeForce RTX 4070", 2.48, 12, "GDDR6X");
        GPU gpu4060Ti = new GPU("NVIDIA", "GeForce RTX 4060 Ti", 2.54, 16, "GDDR6");
        GPU gpu4060 = new GPU("NVIDIA", "GeForce RTX 4060", 2.46, 8, "GDDR6");
        GPU gpu3090Ti = new GPU("NVIDIA", "GeForce RTX 3090 Ti", 1.86, 24, "GDDR6X");
        GPU gpu3090 = new GPU("NVIDIA", "GeForce RTX 3090", 1.7, 24, "GDDR6X");
        GPU gpu3080Ti = new GPU("NVIDIA", "GeForce RTX 3080 Ti", 1.67, 12, "GDDR6X");
        GPU gpu3080 = new GPU("NVIDIA", "GeForce RTX 3080", 1.71, 12, "GDDR6X");
        GPU gpu3070Ti = new GPU("NVIDIA", "GeForce RTX 3070 Ti", 1.77, 8, "GDDR6X");
        GPU gpu3070 = new GPU("NVIDIA", "GeForce RTX 3070", 1.73, 8, "GDDR6");
        GPU gpu3060Ti = new GPU("NVIDIA", "GeForce RTX 3060 Ti", 1.67, 8, "GDDR6");
        GPU gpu3060 = new GPU("NVIDIA", "GeForce RTX 3060", 1.78, 12, "GDDR6");
        GPU gpu3050 = new GPU("NVIDIA", "GeForce RTX 3050", 1.76, 8, "GDDR6");

        List<GPU> gpus = new ArrayList<>();
        gpus.add(gpu7600MXT);
        gpus.add(gpu7600M);
        gpus.add(gpu6850MXT);
        gpus.add(gpu6800M);
        gpus.add(gpu6700M);
        gpus.add(gpu6650MXT);
        gpus.add(gpu6650M);
        gpus.add(gpu6600M);
        gpus.add(gpu6550M);
        gpus.add(gpu6500M);
        gpus.add(gpu6450M);
        gpus.add(gpu6300M);
        gpus.add(gpu4090);
        gpus.add(gpu4080);
        gpus.add(gpu4070Ti);
        gpus.add(gpu4070);
        gpus.add(gpu4060Ti);
        gpus.add(gpu4060);
        gpus.add(gpu3090Ti);
        gpus.add(gpu3090);
        gpus.add(gpu3080Ti);
        gpus.add(gpu3080);
        gpus.add(gpu3070Ti);
        gpus.add(gpu3070);
        gpus.add(gpu3060Ti);
        gpus.add(gpu3060);
        gpus.add(gpu3050);

        return gpus;
    }

    private GPU rndGPU() {
        return gpus.get(choice(gpus.size()));
    }

    private List<RAM> getRAMs() {
        RAM ram643200 = new RAM(64, 3200, "DDR4");
        RAM ram642666 = new RAM(64, 2666, "DDR4");
        RAM ram642400 = new RAM(64, 2400, "DDR4");
        RAM ram642133 = new RAM(64, 2133, "DDR4");
        RAM ram323200 = new RAM(32, 3200, "DDR4");
        RAM ram322666 = new RAM(32, 2666, "DDR4");
        RAM ram322400 = new RAM(32, 2400, "DDR4");
        RAM ram322133 = new RAM(32, 2133, "DDR4");
        RAM ram163200 = new RAM(16, 3200, "DDR4");
        RAM ram162666 = new RAM(16, 2666, "DDR4");
        RAM ram162400 = new RAM(16, 2400, "DDR4");
        RAM ram162133 = new RAM(16, 2133, "DDR4");
        RAM ram123200 = new RAM(12, 3200, "DDR4");
        RAM ram122666 = new RAM(12, 2666, "DDR4");
        RAM ram122400 = new RAM(12, 2400, "DDR4");
        RAM ram122133 = new RAM(12, 2133, "DDR4");
        RAM ram83200 = new RAM(8, 3200, "DDR4");
        RAM ram82666 = new RAM(8, 2666, "DDR4");
        RAM ram82400 = new RAM(8, 2400, "DDR4");
        RAM ram82133 = new RAM(8, 2133, "DDR4");

        List<RAM> rams = new ArrayList<>();
        rams.add(ram643200);
        rams.add(ram642666);
        rams.add(ram642400);
        rams.add(ram642133);
        rams.add(ram323200);
        rams.add(ram322666);
        rams.add(ram322400);
        rams.add(ram322133);
        rams.add(ram163200);
        rams.add(ram162666);
        rams.add(ram162400);
        rams.add(ram162133);
        rams.add(ram123200);
        rams.add(ram122666);
        rams.add(ram122400);
        rams.add(ram122133);
        rams.add(ram83200);
        rams.add(ram82666);
        rams.add(ram82400);
        rams.add(ram82133);

        return rams;
    }

    private RAM rndRAM() {
        return rams.get(choice(rams.size()));
    }

    private List<ROM> getROMs() {
        ROM rom8192NVMe = new ROM(8192, "NVMe", "SSD");
        ROM rom8192SATA = new ROM(8192, "SATA", "SSD");
        ROM rom4096NVMe = new ROM(4096, "NVMe", "SSD");
        ROM rom4096SATA = new ROM(4096, "SATA", "SSD");
        ROM rom2048NVMe = new ROM(2048, "NVMe", "SSD");
        ROM rom2048SATA = new ROM(2048, "SATA", "SSD");
        ROM rom512NVMe = new ROM(512, "NVMe", "SSD");
        ROM rom512SATA = new ROM(512, "SATA", "SSD");
        ROM rom500NVMe = new ROM(500, "NVMe", "SSD");
        ROM rom500SATA = new ROM(500, "SATA", "SSD");
        ROM rom256NVMe = new ROM(256, "NVMe", "SSD");
        ROM rom256SATA = new ROM(256, "SATA", "SSD");
        ROM rom250NVMe = new ROM(250, "NVMe", "SSD");
        ROM rom250SATA = new ROM(250, "SATA", "SSD");
        ROM rom128NVMe = new ROM(128, "NVMe", "SSD");
        ROM rom128SATA = new ROM(128, "SATA", "SSD");

        List<ROM> roms = new ArrayList<>();
        roms.add(rom8192NVMe);
        roms.add(rom8192SATA);
        roms.add(rom4096NVMe);
        roms.add(rom4096SATA);
        roms.add(rom2048NVMe);
        roms.add(rom2048SATA);
        roms.add(rom512NVMe);
        roms.add(rom512SATA);
        roms.add(rom500NVMe);
        roms.add(rom500SATA);
        roms.add(rom256NVMe);
        roms.add(rom256SATA);
        roms.add(rom250NVMe);
        roms.add(rom250SATA);
        roms.add(rom128NVMe);
        roms.add(rom128SATA);

        return roms;
    }

    private ROM rndROM() {
        return roms.get(choice(roms.size()));
    }

    private List<OS> getOS() {
        OS noOs = new OS("Without", "OS");
        OS DOS = new OS("Microsoft", "DOS");
        OS osWin10 = new OS("Microsoft", "Windows 10 Home");
        OS osWin10Prof = new OS("Microsoft", "Windows 10 Professional");
        OS osWin11 = new OS("Microsoft", "Windows 11 Home");
        OS osWin11Prof = new OS("Microsoft", "Windows 11 Professional");
        OS osMint = new OS("Linux", "Mint");
        OS osUbuntu = new OS("Linux", "Ubuntu");
        OS osDebian = new OS("Linux", "Debian");
        OS osMageia = new OS("Linux", "Mageia");
        OS osFedora = new OS("Linux", "Fedora");

        List<OS> oss = new ArrayList<>();
        oss.add(noOs);
        oss.add(DOS);
        oss.add(osWin10);
        oss.add(osWin10Prof);
        oss.add(osWin11);
        oss.add(osWin11Prof);
        oss.add(osMint);
        oss.add(osUbuntu);
        oss.add(osDebian);
        oss.add(osMageia);
        oss.add(osFedora);

        return oss;
    }

    private OS rndOS() {
        return oss.get(choice(oss.size()));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int increment = 0;
        for (Laptop laptop : this.randomList) {
            stringBuilder.append(String.format("%d) ", ++increment))
                         .append(laptop)
                         .append("\n");
        }

        return stringBuilder.toString();
    }
}
