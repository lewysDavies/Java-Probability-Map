# Java-Probability-Map
A simple Generic Java Data-Structure for selecting elements based on probability

# Installation
Copy ProbabilityMap.java into your project. <br><br>
**Please Note**: The code includes javax.annotation(s) and org.apache.commons.lang.Validate(s). These LOCs and imports can be removed/changed if you do not use these libraries. Although, you really should use them :)

# Example Usage
```
ProbabilityMap<String> pm = new ProbabilityMap<>();

pm.add("A", 50);
pm.add("B", 50);
pm.add("C", 25);
pm.add("D", 5);
pm.add("RareAF", 1);

String random = pm.get();
```
# Output / Behaviour Demonstration
Running Test.java with 1000 total selects demonstrates correct probability in the selection. As selection is down to chance, values will obviously vary slightly. Bellow is a typical run:
```
A's Probability is 0.38% | Was selected 0.39% of the time
B's Probability is 0.38% | Was selected 0.38% of the time
C's Probability is 0.19% | Was selected 0.18% of the time
D's Probability is 0.04% | Was selected 0.04% of the time
RareAF's Probability is 0.01% | Was selected 0.01% of the time
```
