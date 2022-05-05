## Start Hadoop

Do whenever you restart ubuntu/window system restart/system start

Start hadoop cluster

```
ssh localhost

start-all.sh

jps 
```

ensure jps listing DataNode, NameNode, SecondaryNameNode, ResourceManager running..




## Start Jupyter

```
jupyterlab --no-browser --ip="0.0.0.0"

```

Look for url   starts with ubuntu-virtual-machine, copy and paste into google chrome on windows


## Git pull from original branch

```
git add  .
git commit -m "pysprl"
git pull origin main
```

Ctrl + O then Enter to save comments
Ctrl +X to exit nano editor


```
git add  .
git commit -m "get merge"
git push origin main
```
