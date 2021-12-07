export default {
    computed:{
        paragrafReverse(){
            return this.paragraf.split('').reverse().join('').toLowerCase()
        },
        paragrafSize(){
            return this.paragrafTwo + '(' + this.paragrafTwo.split('').length + ')'
        }
    }
}