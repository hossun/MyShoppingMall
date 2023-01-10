<template>

    <v-data-table
        :headers="headers"
        :items="searchItem"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchItemView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchItem : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchItems'))

            temp.data._embedded.searchItems.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchItem = temp.data._embedded.searchItems;
        },
        methods: {
        }
    }
</script>

