

listOfRepos =         ["repo/association/branch/master","repo/publish/branch/master"]
listOfChildBranches = [["childBranch1","childBranch2","childBranch3"],
                           ["working1","demo2","rebased3"]]
newList = dict()
for i in range(0,len(listOfRepos)):
    newList[listOfRepos[i]] = listOfChildBranches[i]

for idx,i in enumerate(listOfRepos):
    print(i+"="+str(newList[str(listOfRepos[idx])]))

