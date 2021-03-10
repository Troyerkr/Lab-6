class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  String getTreeName() {
    return treeName;
  }

  String getTreeType() {
    return treeType;
  }

  boolean getLeavesFall() {
    return leavesFall;
  }

  String getLeafColor() {
    return leafColor;
  }

  void setTreeName(String theTreeName) {
    treeName = theTreeName;
  }

  void setTreeType(String theTreeType) {
    treeType = theTreeType;
  }

  void setLeavesFall(boolean theLeavesFall) {
    leavesFall = theLeavesFall;
  }

  void setLeafColor(String theLeafColor) {
    leafColor = theLeafColor;
  }

  void print(){
    
    if(leavesFall == true){
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does lose its leaves for the winter.");
    }
    else{
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does not lose its leaves for the winter.");
    }
    
  }
}