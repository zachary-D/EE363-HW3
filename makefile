.PHONY: clean
.PHONY: run
.PHONY: all


run: all
	java ParSqrtAvgCalc

all: RThread.class ParSqrtAvgCalc.class
	
RThread.class: RThread.java
	javac RThread.java
       
ParSqrtAvgCalc.class: ParSqrtAvgCalc.java
	javac ParSqrtAvgCalc.java

clean:
	rm *.class -rf

