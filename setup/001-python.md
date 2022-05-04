## basic

```
sudo apt update

sudo apt upgrade
```

## Setup Python

Mini conda

```
wget https://repo.anaconda.com/miniconda/Miniconda3-py38_4.11.0-Linux-x86_64.sh
```

```
sh Miniconda3-py38_4.11.0-Linux-x86_64.sh 
```

Press Enter to read license

Press Yes to agree with license 

Press Enter for location


Press Yes for Conda init


# install Jupyter

```
pip install jupyterlab
```

# disable ubuntu firewall

open terminal

```
sudo ufw disable
```

# check linux ip

open terminal 

notedown the ip address

```
ifconfig 
```



# set windows host name to linux


open command prompt in windows

```
notepad C:\Windows\System32\Drivers\etc\hosts
```

paste below, modify ip address as shown in ifconfig in linux terminal

```
192.168.174.129 ubuntu-virtual-machine
```

save the hosts file

in command prompt 

```
ping ubuntu-virtual-machine
```


# start jupyter

```
jupyterlab --no-browser --ip="0.0.0.0"
```

or 

```
jupyter lab --no-browser --ip="0.0.0.0"
```


notedown the url listed by the command output

Open firefox in ubuntu and paste the url with token


