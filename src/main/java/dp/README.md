# DP Solutions characterstics?

1) Mutually exclusive - When two events are mutually exclusive, it means they cannot both occur at the same time. But it doesn’t necessarily imply that one of the two events has to happen.
2) Mutually exhaustive - When two events are exhaustive, it means that one of them must occur.

Example - Coin toss. The results are mutually exclusive (it will be either heads or tails; it can’t be both on the same flip). And it will be one of the two options — heads and tails are the only possible options (thus they are exhaustive).

# How to see if we need DP?

1) Repeated SubProblems or Overlapping SubProblems
2) Optimal SubStructure
    - if we want to compute optimal answer for the bigger problem, then if we have optimal answer for sub problem and they contribute optimally for the bigger problem so that optimal answer for the bigger problem can be constructed from optimal answer of sub problems.
