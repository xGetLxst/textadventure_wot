public class Map {

  private MapPosition[][] positions;


  private int maxX;
  private int maxY;


  public Map(int maxX, int maxY) {
    this.maxX = maxX;
    this.maxY = maxY;
    this.positions = createMapSmall();
  }

  public int getmaxX() {
    return maxX;
}

public void setmaxX(int maxX) {
}

public int getmaxY() {
  return maxY;
}

public void setmaxY(int maxY) {
}


  public void placeElement(int x, int y, MapElement mapElement) {
    this.positions[x][y].setElement(mapElement);
  }



  public MapPosition[][] getPositions() {
    return positions;
  }

  private static MapPosition[][] createMapSmall() {
    MapPosition[][] map = new MapPosition[3][3];
    

    map[0][0] = new MapPosition(new Field("weg"));
    map[0][1] = new MapPosition(new Field("weg"));
    map[0][2] = new MapPosition(new Field("weg"));

    map[1][0] = new MapPosition(new Field("weg"));
    map[1][1] = new MapPosition(new Field("weg"));
    map[1][2] = new MapPosition(new Field("weg"));

    map[2][0] = new MapPosition(new Field("weg"));
    map[2][1] = new MapPosition(new Field("weg"));
    map[2][2] = new MapPosition(new Field("weg"));

    return map;
  }

  private static MapPosition[][] createMap() {

    MapPosition[][] map = new MapPosition[9][9];

    for (int y = 0; y <= 8; y++) {
      for (int x = 0; x <= 8; x++) {
        map[x][y] = new MapPosition(new Field("HALLO HIER IST DAS MEER WILLST DU SCHWIMMEN ODER WAS?!!"));
      }
    }

    for (int n = 0; n < 8; n++) {
      map[8][n] = new MapPosition(new Field("Hier ist das Meer."));
      map[n][8] = new MapPosition(new Field("Hier ist das Meer."));
    }

    map[0][0] = new MapPosition(new Field("Hier ist dein Zuhause."));
    map[0][1] = new MapPosition(new Meer());
    map[0][2] = new MapPosition(new Meer());
    map[0][3] = new MapPosition(new Meer());
    map[0][4] = new MapPosition(new Meer());
    map[0][5] = new MapPosition(new Meer());
    map[0][6] = new MapPosition(new Meer());
    map[0][7] = new MapPosition(new Meer());
    map[0][8] = new MapPosition(new Meer());

    map[1][0] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[1][1] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[1][2] = new MapPosition(new Wald());
    map[1][3] = new MapPosition(new Wald());
    map[1][4] = new MapPosition(new Wald());
    map[1][5] = new MapPosition(new Wald());
    map[1][6] = new MapPosition(new Wald());
    map[1][7] = new MapPosition(new Wald());
    map[1][8] = new MapPosition(new Meer());

    map[2][0] = new MapPosition(new Meer());
    map[2][1] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[2][2] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[2][3] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[2][4] = new MapPosition(new Field("Hier ist der Markt."));
    map[2][5] = new MapPosition(new Wald());
    map[2][6] = new MapPosition(new Wald());
    map[2][7] = new MapPosition(new Wald());
    map[2][8] = new MapPosition(new Meer());

    map[3][0] = new MapPosition(new Meer());
    map[3][1] = new MapPosition(new Wald());
    map[3][2] = new MapPosition(new Wald());
    map[3][3] = new MapPosition(new Wald());
    map[3][4] = new MapPosition(new Field("Hier ist der Waldweg."));
    map[3][5] = new MapPosition(new Wald());
    map[3][6] = new MapPosition(new Wald());
    map[3][7] = new MapPosition(new Wald());
    map[3][8] = new MapPosition(new Meer());

    map[4][0] = new MapPosition(new Meer());
    map[4][1] = new MapPosition(new Wald());
    map[4][2] = new MapPosition(new Wald());
    map[4][3] = new MapPosition(new Wald());
    map[4][4] = new MapPosition(new Wald());
    map[4][5] = new MapPosition(new Wald());
    map[4][6] = new MapPosition(new Wald());
    map[4][7] = new MapPosition(new Wald());
    map[4][8] = new MapPosition(new Meer());

    map[5][0] = new MapPosition(new Meer());
    map[5][1] = new MapPosition(new Koboldcave());
    map[5][2] = new MapPosition(new Koboldcave());
    map[5][3] = new MapPosition(new Wald());
    map[5][4] = new MapPosition(new Wald());
    map[5][5] = new MapPosition(new Wald());
    map[5][6] = new MapPosition(new Ruinen());
    map[5][7] = new MapPosition(new Ruinen());
    map[5][8] = new MapPosition(new Meer());

    map[6][0] = new MapPosition(new Meer());
    map[6][1] = new MapPosition(new Koboldcave());
    map[6][2] = new MapPosition(new Koboldcave());
    map[6][3] = new MapPosition(new Wald());
    map[6][4] = new MapPosition(new Wald());
    map[6][5] = new MapPosition(new Wald());
    map[6][6] = new MapPosition(new Ruinen());
    map[6][7] = new MapPosition(new Ruinen());
    map[6][8] = new MapPosition(new Meer());

    map[7][0] = new MapPosition(new Meer());
    map[7][1] = new MapPosition(new Wald());
    map[7][2] = new MapPosition(new Wald());
    map[7][3] = new MapPosition(new Wald());
    map[7][4] = new MapPosition(new Wald());
    map[7][5] = new MapPosition(new Wald());
    map[7][6] = new MapPosition(new Wald());
    map[7][7] = new MapPosition(new Wald());
    map[7][8] = new MapPosition(new Meer());

    map[8][0] = new MapPosition(new Meer());
    map[8][1] = new MapPosition(new Meer());
    map[8][2] = new MapPosition(new Meer());
    map[8][3] = new MapPosition(new Meer());
    map[8][4] = new MapPosition(new Meer());
    map[8][5] = new MapPosition(new Meer());
    map[8][6] = new MapPosition(new Meer());
    map[8][7] = new MapPosition(new Meer());
    map[8][8] = new MapPosition(new Meer());

    return map;
  }
}
