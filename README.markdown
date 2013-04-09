# Getting started

1. [Install VirtualBox 4.2](https://github.com/tbatchelli/vmfest#install-virtualbox-42x)
2. [Define the VMFest service](https://github.com/pallet/pallet-vmfest#defining-the-compute-service) in your profile
3. [Install the image](https://github.com/pallet/pallet-vmfest#usage) which will be named :ubuntu-12.04

    `lein pallet add-vmfest-image "https://s3.amazonaws.com/vmfest-images/ubuntu-12.04.vdi.gz"`

4. Ensure ssh-agent has your key

    ssh-add

5. Clone the project
6. Configure `~/.pallet/services/vmfest.clj`

    {:vmfest {:provider "vmfest"}}

7. Configure `~/.pallet/services/cloudservers-us.clj`

    {:cloudservers-us {:provider "cloudservers-us"
                       :identity "yourUsername"
                       :credential "yourCredential"}}

# How it fits together

The cluster configuration lives in conf/*.yaml. If you want to change the size of clusters then do it in those files and reconverge `lein pallet converge`

