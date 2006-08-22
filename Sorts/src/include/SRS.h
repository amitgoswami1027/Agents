#ifndef SRS_H
#define SRS_H

#include "SRSShape.h"
#include <string>
using namespace std;

enum twoObjectQueryType {
  RCC_DR,
  RCC_PO,
  RCC_EQ,
  RCC_PP,
  RCC_PPI,
  ORIENTATION,
  ALLOCENTRIC_ORIENTATION
};

class SpatialReasoningSystem {
  public:
    SpatialReasoningSystem();
    void initCanvas(double, double, double);
    void insertCircle(double x, double y, double radius, double i, double j, int id, string name);
    void insertPolygon(list<pair<double, double> >& points, double i, double j, int id, string name);
    void removeShape(int id);

    int twoObjectQuery(twoObjectQueryType type, int referenceId, int primaryId);
    void printAllRelativeOrientations();  
  private:
    map<int, SRSShape*> shapes;
    SDLCanvas canvas;
};

string queryToString(twoObjectQueryType t);

#endif
